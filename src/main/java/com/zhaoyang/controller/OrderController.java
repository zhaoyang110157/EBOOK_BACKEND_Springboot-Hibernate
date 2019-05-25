package com.zhaoyang.controller;

import com.zhaoyang.entity.Orderitem;
import com.zhaoyang.entity.Orders;
import com.zhaoyang.service.OrderService;
import org.hibernate.criterion.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.sql.Timestamp;
import java.util.List;

@RequestMapping("/Orders")
@RestController
public class OrderController {
    @Autowired
    private OrderService orderService;

    @RequestMapping(value = "/getAll" , method = RequestMethod.GET)
    public List<Orders> getAll(@RequestParam int id){
        return orderService.getAllById(id);
    }

    @PostMapping("addOrders")
    public void addOrder(@RequestBody Orders orders){
        System.out.print("addOrders started\n" );
        int oid = (int)orderService.getOid()+1;
        System.out.print("oid "+orders.getOid()+" id "+orders.getId() + "\n");
        orders.setOid(oid);
        orders.setItemOid(oid);
        orderService.addOrder(orders);
    }

}
