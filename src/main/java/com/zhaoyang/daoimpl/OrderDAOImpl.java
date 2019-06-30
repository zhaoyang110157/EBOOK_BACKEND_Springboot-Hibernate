package com.zhaoyang.daoimpl;

import com.zhaoyang.dao.OrderDAO;
import com.zhaoyang.entity.Orderitem;
import com.zhaoyang.entity.Orders;
import com.zhaoyang.repository.OrderItemRepository;
import com.zhaoyang.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

@Repository
public class OrderDAOImpl implements OrderDAO {
    @Autowired
    private OrderRepository orderRepository;

    @Autowired
    private OrderItemRepository orderItemRepository;
    @Override
    public void addOrder(Orders orders){
        orderRepository.saveAndFlush(orders);
    }

    @Override
    public Orders getOne(int oid){ return orderRepository.findOrdersByOid(oid);}

    @Override
    public List<Orders> getAllById(int id){ return orderRepository.findOrdersById(id);}

    @Override
    public List<Orders> getAll(){ return orderRepository.findAll(); }

    @Override
    public long getOid(){
        List<Orders> ordersList = orderRepository.findAll();
        Orders orders = ordersList.get(ordersList.size()-1);
        return orders.getOid()+1;
    }

    @Override
    public long getIid(){
        List<Orderitem> orderitemList = orderItemRepository.findAll();
        Orderitem orderitem = orderitemList.get(orderitemList.size()-1);
        return orderitem.getIid()+1;
    }
}
