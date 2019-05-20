package com.zhaoyang.service;

import com.zhaoyang.entity.User;

import java.util.List;

public interface UserService {
    User signIn( String account ,String password);
    int signUp(User user);
    List<User> getAll();
    void changeAllow(int id,int allow);
}
