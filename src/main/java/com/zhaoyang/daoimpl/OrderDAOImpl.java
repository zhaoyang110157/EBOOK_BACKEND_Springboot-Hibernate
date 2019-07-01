package com.zhaoyang.daoimpl;

import com.zhaoyang.dao.OrderDAO;
import com.zhaoyang.entity.Orderitem;
import com.zhaoyang.entity.Orders;
import com.zhaoyang.repository.OrderItemRepository;
import com.zhaoyang.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.Query;

import java.util.ArrayList;
import java.util.Iterator;
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
    public Orders getOne(int oid){
        Orders tmp = orderRepository.findOrdersByOid(oid);
        return tmp;
    }

    @Override
    public List<Orders> getAll(){ return orderRepository.findAll(); }
    @Override
    public List<Orders> getAll(int id){
        List<Orders> tmp = orderRepository.findAll();
        System.out.println("findAll size = " + tmp.size());
        Iterator<Orders> iter = tmp.iterator();
        while(iter.hasNext()){  //执行过程中会执行数据锁定，性能稍差，若在循环过程中要去掉某个元素只能调用iter.remove()方法。
            Orders orders = iter.next();
            System.out.println(iter.next());
            if(orders.getId() != id)
            {
                iter.remove();
            }
        }
        System.out.println("final size "+ tmp.size());
        return tmp;
    }

    @Override
    public long getOid(){
        System.out.println("orderR count "+ orderRepository.count());
        return orderRepository.count()+1;
    }

    @Override
    public long getIid(){
        List<Orderitem> orderitemList = orderItemRepository.findAll();
        Orderitem orderitem = orderitemList.get(orderitemList.size()-1);
        return orderitem.getIid()+1;
    }

    @Override
    public List<Orderitem> getItems(){
        return orderItemRepository.findAll();
    }
}
