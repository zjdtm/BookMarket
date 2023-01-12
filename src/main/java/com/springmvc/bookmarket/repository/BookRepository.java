package com.springmvc.bookmarket.repository;

import com.springmvc.bookmarket.domain.Book;

import java.util.List;

public interface BookRepository {
    List<Book> getAllBookList();
}
