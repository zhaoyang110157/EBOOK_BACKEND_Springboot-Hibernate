package com.zhaoyang.repository;

import com.zhaoyang.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserRepository extends JpaRepository<User,Integer> {
    User findUserById(int id);
    List<User> findUserByAccount(String account);
}
