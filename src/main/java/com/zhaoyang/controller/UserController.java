package com.zhaoyang.controller;

import com.zhaoyang.entity.LoginState;
import com.zhaoyang.entity.User;
import com.zhaoyang.entity.UserState;
import com.zhaoyang.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import javax.servlet.http.HttpSession;
import java.util.List;

@RestController
@RequestMapping(value = "/user")
public class UserController {
    //创建链接数据库的接口实例
    @Autowired
    private UserService userservice;

    @RequestMapping(value = "/login",method = RequestMethod.POST)
    @ResponseBody
    public String login(@RequestBody LoginState loginState,HttpSession session){
        String account = loginState.getAccount();
        String password = loginState.getPassword();
        return "";
    }


}
