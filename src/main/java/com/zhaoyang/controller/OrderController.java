package com.zhaoyang.controller;

import com.zhaoyang.entity.Orders;
import com.zhaoyang.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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
        int oid = (int)orderService.getOid();
        orders.setItemOid(oid);
        orderService.addOrder(orders);
    }

}
