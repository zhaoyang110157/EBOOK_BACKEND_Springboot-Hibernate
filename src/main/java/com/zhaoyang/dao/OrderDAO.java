package com.zhaoyang.dao;

import com.zhaoyang.entity.Orders;

import java.util.List;

public interface OrderDAO {
    void addOrder(Orders orders);

    Orders getOne(int oid);

    List<Orders> getAllById(int id);

    List<Orders> getAll();

    long getOid();
    long getIid();
}
