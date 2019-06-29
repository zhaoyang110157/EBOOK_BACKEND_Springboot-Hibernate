package com.zhaoyang.repository;


import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import com.zhaoyang.entity.Image;

import java.util.Optional;

public interface ImageRepository extends MongoRepository<Image , String>{
}
