package com.zhaoyang.daoimpl;


import com.zhaoyang.dao.BookDAO;
import com.zhaoyang.entity.Book;
import com.zhaoyang.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class BookDAOImpl implements BookDAO {
    @Autowired
    private BookRepository bookRepository;

    @Override
    public void  addBook(Book book){
        bookRepository.save(book);
    }

    @Override
    public void modifyBook(Book newBook, Book oldBook){
        bookRepository.delete(oldBook);
        if(newBook.getTitle().equals("")){
            newBook.setTitle(oldBook.getTitle());
        }
        if(newBook.getBid() == 0)
        {
            newBook.setBid(oldBook.getBid());
        }
        if(newBook.getImage().equals("")) {
            newBook.setImage(oldBook.getImage());
        }
        if(newBook.getISBN().equals("")){
            newBook.setISBN(oldBook.getISBN());
        }
        if(newBook.getWriter().equals("")){
            newBook.setWriter(oldBook.getWriter());
        }
        if(newBook.getInventory()==0){
            newBook.setInventory(oldBook.getInventory());
        }
        if(newBook.getTranch().equals("")){
            newBook.setTranch(oldBook.getTranch());
        }
        if(newBook.getIntroduction().equals("")){
            newBook.setIntroduction(oldBook.getIntroduction());
        }
        bookRepository.save(newBook);
    }

    @Override
    public Book getOne(int bid){
        return bookRepository.findBookByBid(bid);
    }

    @Override
    public List<Book> getAll(){
        return bookRepository.findAll();
    }

    @Override
    public void deleteBook(int bid){
        Book book = bookRepository.findBookByBid(bid);
        bookRepository.delete(book);
    }
}
