package com.zhaoyang.controller;

import com.zhaoyang.service.PictureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

@RestController
@RequestMapping("/picture")
@CrossOrigin
public class PictureController {
    @Autowired
    PictureService pictureService;

    @PostMapping(value = "/upload/{bookID}")
    public String uploadPicture(@RequestParam("file") MultipartFile multipartFile, @PathVariable("bookID") Integer bookID) {
        if (multipartFile.isEmpty())
            return "请选择一张图片";
        if (pictureService.upload(multipartFile, bookID))
            return "图片上传成功";
        else
            return "图片上传失败";
    }

    @GetMapping(value = "/download/{id}",produces = {MediaType.IMAGE_JPEG_VALUE,MediaType.IMAGE_PNG_VALUE})
    public byte[] download(@PathVariable String id){
        return pictureService.getPictureBlob(id);
    }
}