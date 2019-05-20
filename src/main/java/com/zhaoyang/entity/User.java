package com.zhaoyang.entity;
import lombok.Data;

import javax.persistence.*;

//User实体定义
@Entity
@Table(name = "users" , schema = "ebook")
public class User {
    private String account;
    private String password;
    private Integer id;
    private Integer allowed;
    private String role;

    @Id
    @Column(name = "id" ,nullable = false)
    public int getId(){return id;}
    public void setId(int id){ this.id = id;}

    @Basic
    @Column(name = "account", nullable = false ,length = 50)
    public String getAccount(){return account;}
    public void setAccount(String account){this.account = account; }

    @Basic
    @Column(name = "password" , nullable = false , length = 50)
    public String getPassword(){return password;}
    public void setPassword(String password){this.password = password;}

    @Basic
    @Column(name = "allowed" , nullable = false)
    public int getAllowed() {return allowed;}
    public void setAllowed(int allowed){ this.allowed = allowed;}

    @Basic
    @Column(name = "role" ,nullable = false ,length = 7)
    public String getRole(){return role;}
    public void setRole(String role){this.role = role;}
}
