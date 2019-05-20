package com.zhaoyang.serviceImpl;

import com.zhaoyang.dao.UserDAO;
import com.zhaoyang.entity.User;
import com.zhaoyang.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class UserServiceImpl implements UserService {
    @Autowired
    private UserDAO userDAO ;

    @Override
    public User signIn(String account, String password){
        int id = userDAO.signIn(account,password);
        if(id<0){
            User user=new User();
            user.setId(id);
            return user;
        }
        else {
            User user = userDAO.getOne(id);
            user.setPassword("");
            return user;
        }
    }

    @Override
    public int signUp(User user){
        return userDAO.signUp(user);
    }

    @Override
    public List<User> getAll(){
        return userDAO.getAll();
    }

    @Override
    public void changeAllow(int id,int allow){
        userDAO.changeAllow(id,allow);
    }
}
