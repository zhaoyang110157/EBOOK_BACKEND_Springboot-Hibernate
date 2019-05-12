package com.zhaoyang.entity;
import lombok.Data;

//User实体定义
@Data
public class User {
    private String account;
    private String password;
    private Integer id;
    private Integer allowed;
    private String role;
}
