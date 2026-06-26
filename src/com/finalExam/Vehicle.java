package com.finalExam;

public class Vehicle 
{
    String  tnkb,
            name,
            type;
    int     cc,
            year,
            dueMonth;

    public Vehicle() {}
    public Vehicle (String tnkb, String name, String type, int cc, int year, int dueMonth) 
    {
        this.tnkb       = tnkb;
        this.name       = name;
        this.type       = type;
        this.cc         = cc;
        this.year       = year;
        this.dueMonth   = dueMonth;
    }
}
