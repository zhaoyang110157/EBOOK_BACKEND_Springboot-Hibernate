package com.zhaoyang.dao;

import com.zhaoyang.entity.User;

import java.util.List;

public interface UserDAO {
    void changeAllow(int id,int allowed);
    int signIn(String account, String password);
    int signUp(User user);
    List<User> getAll();
    User getOne(int id);
    long getId();
}
