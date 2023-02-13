package com.flipkart.bean;

import java.util.Date;

public class IssuedBooks {
    private int issuedBookID;
    private int studentID;
    private String studentName;
    private String studentContact;
    private Date issuedDate;

    public int getIssuedBookID() {
        return issuedBookID;
    }

    public void setIssuedBookID(int issuedBookID) {
        this.issuedBookID = issuedBookID;
    }

    public int getStudentID() {
        return studentID;
    }

    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getStudentContact() {
        return studentContact;
    }

    public void setStudentContact(String studentContact) {
        this.studentContact = studentContact;
    }

    public Date getIssuedDate() {
        return issuedDate;
    }

    public void setIssuedDate(Date issuedDate) {
        this.issuedDate = issuedDate;
    }
}
