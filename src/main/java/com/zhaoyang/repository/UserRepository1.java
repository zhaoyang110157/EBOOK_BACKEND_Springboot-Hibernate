package com.zhaoyang.repository;

import com.example.demo.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by chenhaopeng on 2019/5/2.
 */
public interface UserRepository extends JpaRepository<User, Integer>{

}

