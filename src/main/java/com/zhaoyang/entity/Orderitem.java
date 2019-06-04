package com.zhaoyang.entity;

import com.zhaoyang.entity.Orders;
import com.zhaoyang.entity.Book;
import javax.persistence.*;

@Entity
@Table(name = "orderitem", schema = "ebook", catalog = "")
public class Orderitem {
    @EmbeddedId
    private OrderitemPK PK= new OrderitemPK();

    private Integer sales;
    private Double price;

    public Orderitem(Orders orders, Book bid, int sales,double price){
        this.PK = new OrderitemPK(orders,bid);
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Orderitem that = (Orderitem) o;

        if (PK != that.PK) return false;
        if (sales != null ? !sales.equals(that.sales) : that.sales != null) return false;
        if (price != null ? !price.equals(that.price) : that.price != null) return false;

        return true;
    }

}
