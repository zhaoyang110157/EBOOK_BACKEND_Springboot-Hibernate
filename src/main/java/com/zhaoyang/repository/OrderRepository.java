package com.zhaoyang.repository;

import com.zhaoyang.entity.Orders;
import org.springframework.data.jpa.repository.JpaRepository;

import java.sql.Timestamp;
import java.util.List;

public interface OrderRepository extends JpaRepository<Orders,Integer> {
    List<Orders> findOrdersById(int id);
    List<Orders> findOrdersByTime(Timestamp timestamp);
}
