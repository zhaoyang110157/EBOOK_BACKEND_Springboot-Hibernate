package com.zhaoyang.entity;

import javax.persistence.*;

@Entity
@Table(name = "orderitem", schema = "ebook", catalog = "")
@IdClass(OrderitemPK.class)
public class Orderitem {
    private int oid;
    private int bid;
    private Integer sales;
    private Double price;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "oid")
    private Orders orders;
    @Id
    @Column(name = "oid")
    public int getOid() {
        return oid;
    }

    public void setOid(int oid) {
        this.oid = oid;
    }

    @Id
    @Column(name = "bid")
    public int getBid() {
        return bid;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Orderitem that = (Orderitem) o;

        if (oid != that.oid) return false;
        if (bid != that.bid) return false;
        if (sales != null ? !sales.equals(that.sales) : that.sales != null) return false;
        if (price != null ? !price.equals(that.price) : that.price != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = oid;
        result = 31 * result + bid;
        result = 31 * result + (sales != null ? sales.hashCode() : 0);
        result = 31 * result + (price != null ? price.hashCode() : 0);
        return result;
    }
}
