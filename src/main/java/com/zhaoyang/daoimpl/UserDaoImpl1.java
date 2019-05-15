package com.zhaoyang.daoimpl;

import com.example.demo.dao.UserDao;
import com.example.demo.entity.User;
import com.example.demo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 * Created by chenhaopeng on 2019/5/2.
 */
@Repository
public class UserDaoImpl implements UserDao {
        @Autowired
        private UserRepository userRepository;


        @Override
        public User findOne(Integer id) {
            return userRepository.getOne(id);
        }
}
