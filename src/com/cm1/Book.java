package com.cm1;

public class Book 
{
    String code, title, status;
    int year, phone_number;

    Book(String code, String title, int year, int phone_number) 
    {
        this.code = code;
        this.title = title;
        this.year = year;
        this.phone_number = phone_number;
        this.status = "Available";
    }

    void printBook() 
    {
        System.out.println("Code: " + code + " | Title: " + title + " | Year: " + year + " | phone_number: " + phone_number);
    }
}
