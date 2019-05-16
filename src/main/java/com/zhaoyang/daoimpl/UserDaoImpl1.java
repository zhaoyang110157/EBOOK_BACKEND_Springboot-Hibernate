package com.zhaoyang.daoimpl;

import com.zhaoyang.dao.UserDao1;
import com.zhaoyang.entity.User1;
import com.zhaoyang.repository.UserRepository1;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 * Created by chenhaopeng on 2019/5/2.
 */
@Repository
public class UserDaoImpl1 implements UserDao1 {
        @Autowired
        private UserRepository1 userRepository;


        @Override
        public User1 findOne(Integer id) {
            return userRepository.getOne(id);
        }
}
