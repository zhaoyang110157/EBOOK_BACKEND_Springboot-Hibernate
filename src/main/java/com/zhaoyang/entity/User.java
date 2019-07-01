package com.zhaoyang.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "users", schema = "ebook", catalog = "")
public class User {
    private String account;
    private int id;
    private String password;
    private Integer allowed;
    private String role;
    private List<Orders> ordersList;
    @Basic
    @Column(name = "account")
    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "password")
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Basic
    @Column(name = "allowed")
    public Integer getAllowed() {
        return allowed;
    }

    public void setAllowed(Integer allowed) {
        this.allowed = allowed;
    }

    @Basic
    @Column(name = "role")
    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }


    @OneToMany(fetch = FetchType.LAZY)
    @JoinTable(name="orders",joinColumns = @JoinColumn(name = "id"),inverseJoinColumns = @JoinColumn(name="oid"))
    public List<Orders> getOrderList() {
        return ordersList;
    }

    public void setOrderList(List<Orders> orderList) {
        this.ordersList = orderList;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        User that = (User) o;

        if (id != that.id) return false;
        if (account != null ? !account.equals(that.account) : that.account != null) return false;
        if (password != null ? !password.equals(that.password) : that.password != null) return false;
        if (allowed != null ? !allowed.equals(that.allowed) : that.allowed != null) return false;
        if (role != null ? !role.equals(that.role) : that.role != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = account != null ? account.hashCode() : 0;
        result = 31 * result + id;
        result = 31 * result + (password != null ? password.hashCode() : 0);
        result = 31 * result + (allowed != null ? allowed.hashCode() : 0);
        result = 31 * result + (role != null ? role.hashCode() : 0);
        return result;
    }
}
