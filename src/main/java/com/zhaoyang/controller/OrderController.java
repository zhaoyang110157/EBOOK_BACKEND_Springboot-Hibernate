package com.zhaoyang.controller;

import com.zhaoyang.entity.Orderitem;
import com.zhaoyang.entity.Orders;
import com.zhaoyang.entity.Temp;
import com.zhaoyang.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@CrossOrigin(origins = "http://localhost:8080")
@RequestMapping("/Orders")
@RestController
public class OrderController {
    @Autowired
    private OrderService orderService;

    @RequestMapping(value = "/getAll" , method = RequestMethod.GET)
    public List<Orders> getAll(@RequestParam int id){
        System.out.print(id+"'s orders show \n");
        return orderService.getAllById(id);
    }
    @RequestMapping(value = "/getOne" , method = RequestMethod.GET)
    public Orders getOne(@RequestParam int oid){
        System.out.print(oid+"'s  show \n");
        return orderService.getOne(oid);
    }
    @RequestMapping(value = "/getItems" , method = RequestMethod.GET)
    public List<Orderitem> getItems(){
        return orderService.getItems();
    }
    @PostMapping("addOrders")
    public void addOrder(@RequestBody Temp temp){
        System.out.print("addOrders started\n" );
        int oid = (int)orderService.getOid();
        System.out.print("oid "+oid+" id "+temp.getId() + "\n");
        orderService.addOrder(temp.getId(),temp.getTime(),temp.getBooks(),temp.getNums());
    }

}
