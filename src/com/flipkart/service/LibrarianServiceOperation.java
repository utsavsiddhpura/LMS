package com.flipkart.service;

import com.flipkart.bean.Librarian;
import com.flipkart.util.Utils;

public class LibrarianServiceOperation implements LibrarianService{
    @Override
    public boolean login(int librarianID, String password) {
        for(Librarian it : Utils.librarianList)
        {
            if(it.getLibrarianID()==librarianID && it.getPassword().equals(password))
                return true;
        }
        System.out.println("Wrong credentials!");
        return false;
    }
}
