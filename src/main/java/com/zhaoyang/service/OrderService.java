package com.zhaoyang.service;

import com.zhaoyang.entity.Orders;

import java.util.List;

public interface OrderService {
    void addOrder(Orders orders);

    List<Orders> getAllById(int id);

    Orders getOne(int oid);
    long getOid();

}
