package com.zhaoyang.entity;


import javax.persistence.*;

@Entity
@Table(name = "book", schema = "ebook")
public class Book {
    private String ISBN;
    private String title;
    private String writer;
    private int bid;
    private double price;
    private int inventory;
    private String tranch;
    private String introduction;
    private String image;

    @Id
    @Column(name = "bid" , nullable = false)
    public int getBid() {return bid;}
    public void setBid(int bid){this.bid = bid;}

    @Basic
    @Column(name = "title" , nullable = true , length = 50)
    public String getTitle() {return title;}
    public void  setTitle(String title) {this.title = title;}


    @Basic
    @Column(name = "ISBN" , nullable = true , length = 50)
    public String getISBN() {return ISBN;}
    public void  setISBN(String ISBN) {this.ISBN = ISBN;}

    @Basic
    @Column(name = "writer" , nullable = true , length = 50)
    public String getWriter() {return writer;}
    public void  setWriter(String writer) {this.writer = writer;}

    @Basic
    @Column(name = "price" , nullable = true , precision = 0)
    public Double getPrice() {return price;}
    public void  setPrice(Double price) {this.price = price;}

    @Basic
    @Column(name = "inventory" , nullable = true , precision = 0)
    public int getInventory() {return inventory;}
    public void  setInventory(int inventory) {this.inventory = inventory;}

    @Basic
    @Column(name = "tranch" , nullable = true , length = 50)
    public String getTranch() {return tranch;}
    public void  setTranch(String tranch) {this.tranch = tranch;}

    @Basic
    @Column(name = "introduction" , nullable = true , length = 50)
    public String getIntroduction() {return introduction;}
    public void  setIntroduction(String introduction) {this.introduction = introduction;}

    @Basic
    @Column(name = "image" , nullable = true , length = 50)
    public String getImage() {return image;}
    public void  setImage(String image) {this.image = image;}

}