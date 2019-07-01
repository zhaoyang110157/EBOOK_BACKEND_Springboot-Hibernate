package com.zhaoyang.dao;

import com.zhaoyang.entity.Picture;
import org.bson.types.Binary;

public interface PictureDAO {
    Picture findById(String id);
    Picture addPicture(String name, Binary content, String contentType, long size);
}