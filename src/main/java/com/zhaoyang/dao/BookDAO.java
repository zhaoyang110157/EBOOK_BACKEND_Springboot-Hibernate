package com.zhaoyang.dao;

import com.zhaoyang.entity.Book;
import java.util.List;

public interface BookDAO {
    void addBook(Book book);
    void modifyBook(Book newBook, int bid);

    Book getOne(int bid);

    List<Book> getAll();

    void deleteBook(int bid);
}
