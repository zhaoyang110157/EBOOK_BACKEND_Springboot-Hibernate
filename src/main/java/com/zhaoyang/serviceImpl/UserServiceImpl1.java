package com.zhaoyang.serviceImpl;


import com.zhaoyang.dao.UserDao1;
import com.zhaoyang.entity.User1;
import com.zhaoyang.service.UserService1;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by chenhaopeng on 2019/5/2.
 */
@Service
public class UserServiceImpl1 implements UserService1 {

    @Autowired
    private UserDao1 userDao;

    @Override
    public User1 findEventById(Integer id){
        return userDao.findOne(id);
    }
}
