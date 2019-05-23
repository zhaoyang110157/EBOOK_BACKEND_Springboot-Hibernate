package com.zhaoyang.serviceImpl;

import com.zhaoyang.dao.OrderDAO;
import com.zhaoyang.entity.Orders;
import com.zhaoyang.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class OrderServiceImpl implements OrderService {
    @Autowired
    private OrderDAO orderDAO;

    @Override
    public void addOrder(Orders orders){orderDAO.addOrder(orders);}

    @Override
    public Orders getOne(int oid){ return orderDAO.getOne(oid);}

    @Override
    public List<Orders> getAllById(int id){ return orderDAO.getAllById(id);}
}
