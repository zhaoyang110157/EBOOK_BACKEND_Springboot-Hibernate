package com.zhaoyang.controller;

import com.zhaoyang.entity.Book;
import com.zhaoyang.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/Book")
@RestController
public class BookController {
    @Autowired
    private BookService bookService;

    @PostMapping("/addBook")
    public void addBook(@RequestBody Book book){
        System.out.print("Add a Book \n");
        bookService.addBook(book);
    }

    @RequestMapping(value = "/changeInf" , method = RequestMethod.POST)
    public void modifyBook(@RequestBody Book book){
        System.out.print("modify a Book "+book+"\n");
        bookService.modifyBook(book,book.getBid());
    }

    @PostMapping("/getOne")
    public Book getOne(@RequestParam(value="bid") int bid){
        System.out.print("Get a Book: " + bid +"\n");
        return bookService.getOne(bid);
    }

    @RequestMapping(value = "/getAll", method = RequestMethod.GET)
    public List<Book> getAll(){
        System.out.print("Get All Books \n");
        return bookService.getAll();
    }

    @PostMapping("/deleteBook")
    public void deleteBook(@RequestParam(value = "bid") int bid){
        System.out.print("delet a Book "+ bid + "\n");
        bookService.deleteBook(bid);
    }
}
