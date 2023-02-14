package com.flipkart.service;

import com.flipkart.bean.IssuedBooks;

import java.util.List;

public interface IssuedBookService {
    public boolean addIssuedBook(IssuedBooks issuedBooks);
    public List<IssuedBooks> getIssuedBooks();
    public boolean returnBook(int studentID, int bookID);
}
