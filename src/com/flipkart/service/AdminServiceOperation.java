package com.flipkart.service;

import com.flipkart.bean.Admin;
import com.flipkart.bean.Librarian;
import com.flipkart.util.Utils;

import java.util.List;

public class AdminServiceOperation implements AdminService{
    @Override
    public boolean login(int adminID, String password) {
        for(Admin it : Utils.adminList)
        {
            if(it.getAdminId()==adminID && it.getPassword().equals(password))
            {
                return true;
            }
        }
        System.out.println("Wrong credentials!");
        return false;
    }

    @Override
    public boolean addLibrarian(Librarian librarian) {
        for(Librarian it : Utils.librarianList)
        {
            if(it.getLibrarianID()==librarian.getLibrarianID())
            {
                System.out.println("Librarian with a given ID already exists!");
                return false;
            }
        }
        Utils.librarianList.add(librarian);
        System.out.println("Librarian added successfully");
        return true;
    }

    @Override
    public boolean deleteLibrarian(int librarianID) {
        for(Librarian it : Utils.librarianList)
        {
            if(it.getLibrarianID()==librarianID)
            {
                Utils.librarianList.remove(it);
                System.out.println("Librarian with given id removed successfully!");
                return true;
            }
        }
        System.out.println("No librarian with the given id!");
        return false;
    }

    @Override
    public List<Librarian> getLibrarian() {
        return Utils.librarianList;
    }
}
