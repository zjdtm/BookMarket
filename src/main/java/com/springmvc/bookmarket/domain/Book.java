package com.springmvc.bookmarket.domain;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Book {
    private String bookId;
    private String name;
    private int unitPrice;
    private String author;
    private String description;
    private String publisher;
    private String category;
    private long unitInStock;
    private String releaseDate;
    private String condition;

    public Book() {
        super();
    }

    public Book(String bookId, String name, int unitPrice) {
        this.bookId = bookId;
        this.name = name;
        this.unitPrice = unitPrice;
    }
}
