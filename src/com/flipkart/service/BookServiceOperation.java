package com.flipkart.service;

import com.flipkart.bean.Books;

import java.util.List;

public interface BookServiceOperation {
    public boolean addBook();
    public List<Books> getBooks();

}
