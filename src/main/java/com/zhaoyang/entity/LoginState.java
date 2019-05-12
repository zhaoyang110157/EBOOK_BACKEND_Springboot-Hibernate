package com.zhaoyang.entity;

import lombok.Data;
@Data
public class LoginState {
    private Boolean isLogin;
    private String account;
    private String message;
    private String role;
    private Integer id;
}
