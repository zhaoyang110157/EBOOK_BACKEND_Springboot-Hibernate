package com.zhaoyang.controller;

import com.zhaoyang.entity.SignIn;
import com.zhaoyang.entity.User;
import com.zhaoyang.entity.changeAllow;
import com.zhaoyang.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@CrossOrigin(origins = "http://localhost:8080")
@RequestMapping("/Users")
@RestController
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping("/signIn")
    public User signIn(@RequestBody SignIn signIn){
        String account = signIn.getAccount();
        String password = signIn.getPassword();
        System.out.print(account+" is trying to sign in \n");
        return userService.signIn(account,password);
    }

    @PostMapping("/signUp")
    public int signUp(@RequestBody User user){
        return userService.signUp(user);
    }

    @RequestMapping(value = "/getAll", method = RequestMethod.GET)
    public List<User> getAll(){
        return userService.getAll();
    }

    @PostMapping("changeAllow")
    public void changeAllow(@RequestBody changeAllow changeAllow){
        int id = changeAllow.getId();
        int allowed = changeAllow.getAllowed();
        System.out.print(id +"'s right is changed to "+allowed + "\n");
        userService.changeAllow(id,allowed);
    }

}
