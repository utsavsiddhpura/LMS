package com.flipkart.service;

import com.flipkart.bean.Books;

import java.util.List;

public interface BookService {
    public boolean addBook(Books b);
    public List<Books> getBooks();

}
