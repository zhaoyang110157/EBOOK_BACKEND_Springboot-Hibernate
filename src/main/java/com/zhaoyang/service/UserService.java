package com.zhaoyang.service;

import com.zhaoyang.entity.User;
import com.zhaoyang.entity.UserState;
import com.zhaoyang.entity.LoginState;

import java.util.List;

public interface UserService {
    //新增用户
    void create(String account, String password, Integer id);
    void create(String account, String password, Integer id, Integer allowed, String role);

    //获取数据
    User getUser(String account);

    //判断用户状态
    LoginState getLoginState(String account, String password);

    Integer banUser(String account);
    Integer allowUser(String account);

    List<UserState> getUserStates();

    Boolean ifExist(String account);

}
