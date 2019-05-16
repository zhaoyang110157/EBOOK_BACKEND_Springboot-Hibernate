package com.zhaoyang.controller;

import com.zhaoyang.entity.User1;
import com.zhaoyang.service.UserService1;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController1{

    @Autowired
    private UserService1 userService1;

    @GetMapping(value = "/findUser/{id}")
    public User1 findUser(@PathVariable("id") Integer id) {
        System.out.println("Searching User: " + id);
        //return userService1.findEventById(id);
        return null;
    }
}
