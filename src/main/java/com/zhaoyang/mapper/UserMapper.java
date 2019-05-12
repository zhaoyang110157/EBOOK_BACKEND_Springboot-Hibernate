package com.zhaoyang.mapper;

import com.zhaoyang.entity.User;
import com.zhaoyang.entity.UserState;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserMapper {
    User getUser(String account);
    User getLoginState(String account,String password);
    int changeUser(Integer allowed,String account);
    void createUser(String account,String password,Integer i,Integer allowed,String role);
    List<UserState> getUserState();
}

