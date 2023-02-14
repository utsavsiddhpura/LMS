package com.flipkart.client;

import com.flipkart.bean.Librarian;
import com.flipkart.service.AdminService;
import com.flipkart.service.AdminServiceOperation;

import java.util.List;
import java.util.Scanner;

public class AdminMM {
    AdminService adminService = new AdminServiceOperation();
    AdminMM(){
        System.out.println("Welcome to Admin Portal! Please login first to continue.");
        Scanner scanner = new Scanner(System.in);

        while(true)
        {
            int adminID;
            String password;
            System.out.print("Enter your id: ");
            adminID = scanner.nextInt();
            System.out.print("Enter your password: ");
            password = scanner.next();
            if(adminService.login(adminID,password)) break;
        }

        System.out.println("Please select an option from available below!");

        System.out.println("1. View librarians"+"\n"+"2. Add Librarian"+"\n"+"Delete Librarian");

        String input = scanner.next();
        while(true) {
            switch (input) {
                case "1":
                    List<Librarian> librarianList = adminService.getLibrarian();
                    for (Librarian librarian : librarianList) {
                        System.out.println("Librarian id: " + librarian.getLibrarianID() +
                                "Name: " + librarian.getLibrarianNAme() +
                                "Email: " + librarian.getEmail() +
                                "Contact: " + librarian.getContactNo() +
                                "City: " + librarian.getCity());
                    }
                    continue;
                case "2":
                    System.out.println("Please Enter librarian details!");
                    System.out.print("ID: ");
                    int librarianID = scanner.nextInt();
                    System.out.print("Name: ");
                    String librarianName = scanner.next();
                    System.out.print("Email: ");
                    String librarianEmail = scanner.next();
                    System.out.print("City: ");
                    System.out.print("Contact: ");
            }
        }

    }
}
