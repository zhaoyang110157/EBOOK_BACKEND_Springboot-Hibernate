package com.zhaoyang.service;

import com.zhaoyang.entity.Orders;

import java.util.List;

public interface OrderService {
    void addOrder(Integer id, String time,List<Integer> books, List<Integer> nums);

    List<Orders> getAllById(int id);

    Orders getOne(int oid);

    long getOid();

    long getIid();
}

