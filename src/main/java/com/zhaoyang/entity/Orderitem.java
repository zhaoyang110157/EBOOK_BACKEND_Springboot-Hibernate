package com.zhaoyang.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import org.intellij.lang.annotations.JdkConstants;

import javax.persistence.*;

@Entity
@Table(name = "orderitem", schema = "ebook")
public class Orderitem {
    private int iid;
    private Orders orders;
    private Book book;
    private Integer sales;
    private Double price;

    public Orderitem(Orders orders, Book book,int iid, int sales,double price){
        this.orders = orders;
        this.book = book;
        this.iid = iid;
        this.sales = sales;
        this.price = price;
    }
    public Orderitem(){}

    @Id
    @Column(name = "iid")
    public int getIid(){return iid;}
    public void setIid(int iid){this.iid = iid;}

   @ManyToOne(fetch =  FetchType.EAGER)
   @JoinColumn(name = "oid")
   @JsonBackReference
    public Orders getOrders() {
        return this.orders;
    }
    public void setOrders(Orders oid) {
        this.orders = oid;
    }

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "bid")
    @JsonBackReference
    public Book getBook() {
        return this.book;
    }

    public void setBook(Book bid) {
        this.book = bid;
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
