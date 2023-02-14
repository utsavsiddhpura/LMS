package com.flipkart.service;

import com.flipkart.bean.Books;
import com.flipkart.util.Utils;

import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class BookServiceOperation implements BookService{
    @Override
    public boolean addBook(Books b) {

        for(Books it : Utils.booksList)
        {
            if(it.getBookID()==b.getBookID())
            {
                System.out.println("Book with the same ID already exists!");
                return false;
            }
        }
        Utils.booksList.add(b);
        return true;
    }

    @Override
    public List<Books> getBooks() {
        return Utils.booksList;
    }
}
