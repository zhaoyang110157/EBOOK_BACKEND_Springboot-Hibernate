package com.zhaoyang.entity;

import javax.persistence.*;

@Entity
@Table(name = "orderitem", schema = "ebook")
public class Orderitem {

    @EmbeddedId
    private OrderitemPK PK= new OrderitemPK();

    private Integer sales;
    private Double price;

    public Orderitem(Orders orders, Book book, int sales,double price){
        this.PK = new OrderitemPK(orders,book);
        this.sales = sales;
        this.price = price;
    }
    public Orderitem(){}

   @Transient
    public Orders getOrders() {
        return PK.getOrders();
    }

    public void setOrders(Orders oid) {
        this.PK.setOrders(oid);
    }

    @Transient
    public Book getBook() {
        return this.PK.getBook();
    }

    public void setBook(Book bid) {
        this.PK.setBook(bid);
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
