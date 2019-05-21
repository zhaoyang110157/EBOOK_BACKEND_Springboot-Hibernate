package com.zhaoyang.daoimpl;

import com.zhaoyang.entity.Book;
import com.zhaoyang.dao.BookDAO;
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
    public void modifyBook(Book newBook, int bid){
        Book oldBook = bookRepository.findBookByBid(bid);
        oldBook.setTitle(newBook.getTitle());
        oldBook.setBid(newBook.getBid());
        oldBook.setImage(newBook.getImage());
        oldBook.setIsbn(newBook.getIsbn());
        oldBook.setWriter(newBook.getWriter());
        oldBook.setInventory(newBook.getInventory());
        oldBook.setTranch(newBook.getTranch());
        oldBook.setIntroduction(newBook.getIntroduction());
        bookRepository.saveAndFlush(oldBook);
        System.out.print( "modify succeed \n");
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
