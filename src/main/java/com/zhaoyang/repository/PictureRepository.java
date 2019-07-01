package com.zhaoyang.repository;


import com.zhaoyang.entity.Picture;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
public interface PictureRepository extends MongoRepository<Picture , String>{
    @Query("{'name':?0}")
    Picture findByName(String name);

}
