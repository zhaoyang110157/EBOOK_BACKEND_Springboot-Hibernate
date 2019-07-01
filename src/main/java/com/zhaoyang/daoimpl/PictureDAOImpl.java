package com.zhaoyang.daoimpl;
import com.zhaoyang.dao.PictureDAO;

import com.zhaoyang.entity.Picture;

import com.zhaoyang.repository.PictureRepository;

import org.bson.types.Binary;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Repository;

import java.util.Date;


@Repository
public class PictureDAOImpl implements PictureDAO {

    @Autowired
    PictureRepository pictureRepository;

    @Override
    public Picture findById(String id) {
        return pictureRepository.findById(id).isPresent()?pictureRepository.findById(id).get(): null;
    }

    @Override
    public Picture addPicture(String name, Binary content, String contentType, long size) {
        Picture picture = new Picture();
        picture.setName(name);
        picture.setContent(content);
        picture.setCreatedTime(new Date());
        picture.setContentType(contentType);
        picture.setSize(size);
        return pictureRepository.insert(picture);
    }
}