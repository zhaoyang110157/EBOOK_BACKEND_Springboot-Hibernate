package com.zhaoyang.daoimpl;

import com.zhaoyang.dao.OrderDAO;
import com.zhaoyang.entity.Orderitem;
import com.zhaoyang.entity.Orders;
import com.zhaoyang.repository.OrderRepository;
import com.zhaoyang.repository.OrderitemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class OrderDAOImpl implements OrderDAO {
    @Autowired
    private OrderRepository orderRepository;

    @Autowired
    private OrderitemRepository orderitemRepository;

    @Override
    public void addOrder(Orders orders){

        List<Orderitem> orderitems = orders.getOrderitems();
        for( int i =0 ; i < orderitems.size() ;i++){
            System.out.print("trying to insert orderitem "+orderitems.get(i).getBid()+"\n");
            orderitemRepository.saveAndFlush(orderitems.get(i));
        }
        orderRepository.save(orders);
    }

    @Override
    public Orders getOne(int oid){ return orderRepository.findOrdersByOid(oid);}

    @Override
    public List<Orders> getAllById(int id){ return orderRepository.findOrdersById(id);}

    @Override
    public long getOid(){return orderRepository.count();}
}
