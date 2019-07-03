package com.zhaoyang.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;

@Entity
@Table(name = "orderitem", schema = "ebook")
public class Orderitem {
    private int iid;
    private Orders orders;
    private int bid;
    private Integer sales;
    private Double price;

    public Orderitem(Orders orders, int bid, int sales,double price){
        this.orders = orders;
        this.bid = bid;
        this.sales = sales;
        this.price = price;
    }
    public Orderitem(){}

    @Id
    @Column(name = "iid")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int getIid(){return iid;}
    public void setIid(int iid){this.iid = iid;}

   @ManyToOne(targetEntity =  Orders.class,cascade = CascadeType.ALL,fetch =  FetchType.LAZY)
   @JoinColumn(name = "oid")
    public Orders getOrders() {
        return this.orders;
    }
    public void setOrders(Orders oid) {
        this.orders = oid;
    }

    @Basic
    @Column(name="bid")
    public int getBid() {
        return this.bid;
    }

    public void setBid(int bid) {
        this.bid = bid;
    }

    @Basic
    @Column(name = "sales")
    public Integer getSales() {
        return sales;
    }

    public void setSales(Integer sales) {
        this.sales = sales;
    }

    @Basic
    @Column(name = "price")
    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
}
