package com.flipkart.service;

import com.flipkart.bean.Librarian;

import java.util.List;

public interface AdminService {
    public boolean login(int adminID, String password);
    public boolean addLibrarian(Librarian librarian);
    public boolean deleteLibrarian(int librarianID);
    public List<Librarian> getLibrarian();
}