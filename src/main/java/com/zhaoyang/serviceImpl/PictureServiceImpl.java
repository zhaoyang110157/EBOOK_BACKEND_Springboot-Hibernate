package com.zhaoyang.serviceImpl;

import com.zhaoyang.dao.BookDAO;
import com.zhaoyang.dao.PictureDAO;
import com.zhaoyang.entity.Picture;
import com.zhaoyang.entity.Book;
import com.zhaoyang.service.PictureService;
import org.bson.types.Binary;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;
import java.io.IOException;

@Service
public class PictureServiceImpl implements PictureService {
    @Autowired
    PictureDAO pictureDao;

    @Autowired
    BookDAO bookDao;

    @Override
    public Boolean upload(MultipartFile multipartFile, Integer bookID) {
        try{
            Picture picture = pictureDao.addPicture(multipartFile.getOriginalFilename(),
                    new Binary(multipartFile.getBytes()),
                    multipartFile.getContentType(),
                    multipartFile.getSize());
            Book book = bookDao.getOne(bookID);
            book.setImage("./image/download/" + picture.getId());
            bookDao.modifyBook(book, bookID);
        }catch (IOException e) {
            e.printStackTrace();
           return false;
        }
        return true;
    }

    @Override
    public byte[] getPictureBlob(String id) {
        Picture picture = pictureDao.findById(id);
        if(picture == null)
            return new byte[0];
        return picture.getContent().getData();
    }



}