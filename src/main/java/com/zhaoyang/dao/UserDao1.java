package com.zhaoyang.dao;

import com.example.demo.entity.User;

/**
 * Created by chenhaopeng on 2019/5/2.
 */
public interface UserDao {
    User findOne(Integer id);
}
