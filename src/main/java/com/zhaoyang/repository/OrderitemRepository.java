package com.zhaoyang.repository;

import com.zhaoyang.entity.Orderitem;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface OrderitemRepository extends JpaRepository<Orderitem,Integer> {
    List<Orderitem> findOrderitemsByIdAndOid(int id,int oid);
}
