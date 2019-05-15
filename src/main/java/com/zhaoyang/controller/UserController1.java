package com.zhaoyang.controller;

import com.example.demo.entity.User;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping(value = "/findUser/{id}")
    public User findUser(@PathVariable("id") Integer id) {
        System.out.println("Searching User: " + id);
        return userService.findEventById(id);
    }
}
