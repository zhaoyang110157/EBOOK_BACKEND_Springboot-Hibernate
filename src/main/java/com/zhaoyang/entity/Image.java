package com.zhaoyang.entity;

import org.springframework.data.annotation.Id;

import java.io.File;

public class Image {
    @Id
    public int bid;

    public File file;


}
