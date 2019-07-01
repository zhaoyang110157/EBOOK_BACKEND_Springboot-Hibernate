package com.zhaoyang.repository;

import com.zhaoyang.entity.Orderitem;
import com.zhaoyang.entity.Orders;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface OrderItemRepository extends JpaRepository<Orderitem,Integer> {
    List<Orderitem> findOrderitemsByOrders(Orders orders);
}