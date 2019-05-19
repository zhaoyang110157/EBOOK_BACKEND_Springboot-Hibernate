package com.zhaoyang.repository;


import com.zhaoyang.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;


public interface BookRepository extends JpaRepository<Book, Integer> {
    Book findBookByBid(int bid);
}
