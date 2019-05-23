package com.zhaoyang.daoimpl;

import com.zhaoyang.dao.OrderDAO;
import com.zhaoyang.entity.Orders;
import com.zhaoyang.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class OrderDAOImpl implements OrderDAO {
    @Autowired
    private OrderRepository orderRepository;

    @Override
    public void addOrder(Orders orders){  orderRepository.save(orders);  }

    @Override
    public Orders getOne(int oid){ return orderRepository.findOrdersByOid(oid);}

    @Override
    public List<Orders> getAllById(int id){ return orderRepository.findOrdersById(id);}

}
