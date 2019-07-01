package com.zhaoyang.entity;


import org.bson.types.Binary;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;
import javax.persistence.Entity;

import javax.persistence.Id;
import java.io.Serializable;
import java.util.Date;

@Document
public class Picture implements Serializable {

    @Id
    private String id;

    @Field
    private String name;

    @Field
    private Date createdTime;

    @Field
    private Binary content;

    @Field
    private String contentType;

    @Field
    private long size;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(Date createdTime) {
        this.createdTime = createdTime;
    }

    public Binary getContent() {
        return content;
    }

    public void setContent(Binary content) {
        this.content = content;
    }

    public String getContentType() {
        return contentType;
    }

    public void setContentType(String contentType) {
        this.contentType = contentType;
    }

    public long getSize() {
        return size;
    }

    public void setSize(long size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "Picture{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", createdTime=" + createdTime +
                ", content=" + content +
                ", contentType='" + contentType + '\'' +
                ", size=" + size +
                '}';
    }
}