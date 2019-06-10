package com.zhaoyang.repository;


import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import com.zhaoyang.entity.Image;

import java.util.Optional;

public class ImageRepository extends MongoRepository<Image , String>{
    @Override
    public Optional<Image> findById(String s) {
        return Optional.empty();
    }
}
