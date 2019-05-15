package com.zhaoyang.serviceImpl;

import com.zhaoyang.entity.User;
import com.zhaoyang.entity.UserState;
import com.zhaoyang.entity.LoginState;
import com.zhaoyang.mapper.UserMapper;
import com.zhaoyang.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;
import java.util.List;


@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Autowired
    private UserMapper userMapper;

    @Override
    public void create(String account,String password, Integer id){
        userMapper.createUser(account,password,id,1,"custom");
    }
    @Override
    public void create(String account, String password, Integer id, Integer allowed, String role) {
        userMapper.createUser(account, password, id, allowed,role);
    }

    //获取单个用户数据
    @Override
    public User getUser(String account) {
        User user = userMapper.getUser(account);
        return user;
    }

    //判断用户状态
    @Override
    public LoginState getLoginState(String account, String password) {
        LoginState state = new LoginState();
        User user;

        return state;
    }

    //禁用用户
    @Override
    public Integer banUser(String account) {
        int rows = userMapper.changeUser(0, account);
        return rows;
    }

    //解禁用户
    @Override
    public Integer allowUser(String account) {
        int rows = userMapper.changeUser(1, account);
        return rows;
    }

    @Override
    //获得所有用户状态
    public List<UserState> getUserStates() {
        List<UserState> userStates;
        userStates = userMapper.getUserState();

        return userStates;
    }

    @Override
    //判断用户是否存在
    public Boolean ifExist(String account){
        User user = userMapper.getUser(account);
        if (user != null) {
            return true;
        } else {
                return false;
        }
    }
}
