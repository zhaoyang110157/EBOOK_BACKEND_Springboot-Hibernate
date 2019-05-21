package com.zhaoyang.controller;

import com.zhaoyang.entity.User;
import com.zhaoyang.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@RequestMapping("/Users")
@RestController
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping("/signIn")
    public User signIn(@RequestParam(value = "account") String account, @RequestParam(value = "password") String password){
        System.out.print(account+" is trying to sign in \n");
        return userService.signIn(account,password);
    }

    @PostMapping("/signUp")
    public void signUp(@RequestBody User user){
        userService.signUp(user);
    }

    @RequestMapping(value = "/getAll", method = RequestMethod.GET)
    public List<User> getAll(){
        return userService.getAll();
    }

    @PostMapping("changeAllow")
    public void changeAllow(@RequestParam(value = "id") int id ,@RequestParam(value = "allowed") int allowed){
        userService.changeAllow(id,allowed);
    }

}
