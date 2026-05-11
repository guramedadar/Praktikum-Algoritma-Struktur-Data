package com.jobsheet12;

public class StudentData 
{
    String  nim,
            name,
            className;
    double  gpa;

    public StudentData (String nm, String nama, String kls, double ip)
    {
        nim         = nm;
        name        = nama;
        className   = kls;
        gpa         = ip;
    }

    void print()
    {
        System.out.println(nim + " - " + name + " - " + className + " - " + gpa);
    }
}
