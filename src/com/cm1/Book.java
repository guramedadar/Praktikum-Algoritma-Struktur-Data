package com.cm1;

public class Book 
{
    String code, title, status;
    int year;

    Book(String code, String title, int year) 
    {
        this.code = code;
        this.title = title;
        this.year = year;
        this.status = "Available";
    }

    void printBook() 
    {
        System.out.println("Code: " + code + " | Title: " + title + " | Year: " + year);
    }
}
