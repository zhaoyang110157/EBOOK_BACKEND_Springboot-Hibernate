package com.zhaoyang.service;


import org.springframework.web.multipart.MultipartFile;

public interface PictureService {
    Boolean upload(MultipartFile multipartFile, Integer bookName);
    byte[] getPictureBlob(String id);
}