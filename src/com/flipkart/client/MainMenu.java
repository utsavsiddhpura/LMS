package com.flipkart.client;

import java.util.List;
import java.util.Scanner;

public class MainMenu {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Welcome to Library Management System! Choose your role."+"\n"+
                "1. Admin"+"\n"+"2. Librarian"+"\n"+"3. Exit");

        while(true)
        {
            String input;
            input = in.next();
            switch (input){
                case "1":
                    AdminMM adminMM = new AdminMM();
                    break;
                case "2":
                    LibrarianMM librarianMM = new LibrarianMM();
                    break;
                case "3":
                    System.exit(0);
                    break;
                default:
                    System.out.println("Please select a vallid input!");
                    continue;
            }
        }
    }
}
