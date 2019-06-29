package com.zhaoyang.entity;

import javax.persistence.*;
import java.io.Serializable;


@Embeddable
public class OrderitemPK implements Serializable {
    @ManyToOne(cascade = CascadeType.ALL,fetch = FetchType.LAZY)
    @JoinColumn(name = "oid")
    private Orders orders;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "bid")
    private Book book;

    public OrderitemPK(){}

    public OrderitemPK(Orders oid,Book bid){
        this.book=bid;
        this.orders=oid;
    }

    public Orders getOrders(){
        return orders;
    }

    public void setOrders(Orders orders){
        this.orders = orders;
    }


    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        OrderitemPK that = (OrderitemPK) o;
        if (book != that.book) return false;
        if (orders != that.orders) return false;

        return true;
    }

    @Override
    public int hashCode() {
        final int prime=31;
        int result=1;
        result=prime*result+((orders==null)?0:orders.hashCode());
        result=prime*result+((book==null)?0:book.hashCode());
        return result;
    }
}
