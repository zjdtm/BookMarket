package com.springmvc.bookmarket.service;

import com.springmvc.bookmarket.domain.Book;
import com.springmvc.bookmarket.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import java.util.Set;

@Service
public class BookServiceImpl implements BookService{

    @Autowired
    private BookRepository bookRepository;

    @Override
    public List<Book> getAllBookList() {
        return bookRepository.getAllBookList();
    }

    @Override
    public List<Book> getBookListByCategory(String category) {
        List<Book> booksByCategory = bookRepository.getBookListByCategory(category);
        return booksByCategory;
    }

    @Override
    public Set<Book> getBookListByFilter(Map<String, List<String>> filter) {
        Set<Book> booksByFilter = bookRepository.getBookListByFilter(filter);
        return booksByFilter;
    }

    @Override
    public Book getBookById(String bookId) {
        Book bookById = bookRepository.getBookById(bookId);
        return bookById;
    }

    @Override
    public void setNewBook(Book book) {
        bookRepository.setNewBook(book);
    }

}
