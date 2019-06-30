package com.zhaoyang.entity;

import java.util.List;

public class Temp {
    private int id;
    private String time;
    private List<Integer> books;
    private List<Integer> nums;

    public int getId(){return this.id;}
    public String getTime(){return this.time;}
    public List<Integer> getBooks(){return  this.books;}
    public List<Integer> getNums(){return this.nums;}
}
