package com.zhaoyang.entity;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import org.jetbrains.annotations.Contract;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "orders", schema = "ebook")
@JsonIgnoreProperties(value = {"handler","hibernateLazyInitializer","fieldHandler"})
@JsonIdentityInfo(
        generator = ObjectIdGenerators.PropertyGenerator.class,
        property = "oid"
)
public class Orders {
    private int id;
    private int oid;
    private String time;
    private List<Orderitem> orderitems ;


    public Orders(Integer user_id, Integer oid, String date, List<Orderitem> orderItemList)
    {
        this.id=user_id;
        this.oid=oid;
        this.time = date;
        this.orderitems=null;
        return;
    }

    public Orders(){
    }


    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "oid")
    public int getOid() {
        return oid;
    }

    public void setOid(int oid) {
        this.oid = oid;
    }

    @Basic
    @Column(name = "time")
    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    //@OneToMany(cascade = {CascadeType.ALL},fetch = FetchType.LAZY,targetEntity=com.zhaoyang.entity.Orderitem.class)
    //@JoinTable(name = "orderitem",joinColumns = {@JoinColumn(name = "oid")},inverseJoinColumns = {@JoinColumn(name = "PK.oid")})


    @OneToMany(mappedBy = "orders",cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    public List<Orderitem> getOrderitems(){ return orderitems;}
    public void setOrderitems(List<Orderitem> orderitems){this.orderitems = orderitems;}


    @Contract(value = "null -> false", pure = true)
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Orders that = (Orders) o;

        if (id != that.id) return false;
        if (oid != that.oid) return false;
        if (time != null ? !time.equals(that.time) : that.time != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + oid;
        result = 31 * result + (time != null ? time.hashCode() : 0);
        return result;
    }

    @Override
    public String toString(){
        return "orders: oid = "+oid+" id = "+id;
    }
}
