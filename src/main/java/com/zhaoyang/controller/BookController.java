package com.zhaoyang.controller;

import com.zhaoyang.entity.Book;
import com.zhaoyang.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/Book")
@RestController
public class BookController {
    @Autowired
    private BookService bookService;

    @PostMapping("/addBook")
    public void addBook(@RequestBody Book book){
        System.out.print("Add a Book");
        bookService.addBook(book);
    }
    

}
