package com.flipkart.service;

import com.flipkart.bean.Books;
import com.flipkart.bean.IssuedBooks;
import com.flipkart.util.Utils;

import java.util.List;

public class IssuedBookServiceOperation implements IssuedBookService{
    @Override
    public boolean addIssuedBook(IssuedBooks issuedBooks) {
        for(Books it : Utils.booksList)
        {
            if(it.getBookID()==issuedBooks.getIssuedBookID())
            {
                if(it.getBookQuantity()==0)
                {
                    System.out.println("All copies are already issued, try again after some time!");
                    return false;
                }
                for(IssuedBooks iter : Utils.issuedBooksList)
                {
                    if(iter.getIssuedBookID()==issuedBooks.getIssuedBookID() &&
                            iter.getStudentID()==issuedBooks.getStudentID())
                    {
                        System.out.println("The given student already has that book!");
                        return false;
                    }
                }
                int quantity = it.getBookQuantity();
                it.setBookQuantity(quantity-1);
                Utils.issuedBooksList.add(issuedBooks);
                System.out.println("Book issued successfully!");
                return true;
            }
        }
        System.out.println("No such book with given ID");
        return false;
    }

    @Override
    public List<IssuedBooks> getIssuedBooks() {
        return Utils.issuedBooksList;
    }

    @Override
    public boolean returnBook(int studentID, int bookID) {
        for(IssuedBooks it : Utils.issuedBooksList)
        {
            if(it.getStudentID()==studentID &&
                    it.getIssuedBookID()==bookID)
            {
                Utils.issuedBooksList.remove(it);
                for(Books it1 : Utils.booksList)
                {
                    if(it1.getBookID()==bookID)
                    {
                        int quantity = it1.getBookQuantity();
                        it1.setBookQuantity(quantity+1);
                        break;
                    }
                }
                System.out.println("Return request successful!");
                return true;
            }
        }
        System.out.println("No such issue history!");
        return false;
    }
}
