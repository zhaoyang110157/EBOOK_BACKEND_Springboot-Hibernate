package com.zhaoyang.dao;

import com.zhaoyang.entity.Orderitem;
import com.zhaoyang.entity.Orders;

import java.util.List;

public interface OrderDAO {
    void addOrder(Orders orders);

    Orders getOne(int oid);


    List<Orders> getAll();
    List<Orders> getAll(int id);
    long getOid();
    long getIid();
    List<Orderitem> getItems();
}
