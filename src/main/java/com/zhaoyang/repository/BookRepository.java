package com.zhaoyang.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.zhaoyang.entity.Book;

import java.util.List;

public interface BookRepository extends JpaRepository<Book, Integer> {
    Book findBookByBid(int bid);
    List<Book> findAllByState(int state);
}
