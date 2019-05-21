package com.zhaoyang.entity;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

public class OrdersPK implements Serializable {
    private int id;
    private int oid;

    @Column(name = "id")
    @Id
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Column(name = "oid")
    @Id
    public int getOid() {
        return oid;
    }

    public void setOid(int oid) {
        this.oid = oid;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        OrdersPK that = (OrdersPK) o;

        if (id != that.id) return false;
        if (oid != that.oid) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + oid;
        return result;
    }
}
