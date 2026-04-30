package com.cm1;

public class BookLending 
{
    Student sdt;
    Book book;
    int loanPeriod, loanLimit, overdue, fine;

    BookLending(Student sdt, Book book, int loanPeriod) 
    {
        this.sdt = sdt;
        this.book = book;
        this.loanPeriod = loanPeriod;
        this.loanLimit = 5;
        calculateFine();
    }

    void calculateFine() 
    {
        overdue = (loanPeriod > loanLimit) ? loanPeriod - loanLimit : 0;
        fine = overdue * 2000;
    }

    void printLoansEx()
    {
        if (loanPeriod > loanLimit) 
        {
            System.out.println(sdt.name + " | ");    
        }
    }

    void printLending() 
    {
        System.out.println(sdt.name + " | " + book.title +
            " | Loan Period (days): " + loanPeriod +
            " | Late return of books: " + overdue +
            " | fine: " + fine);
    }
}
