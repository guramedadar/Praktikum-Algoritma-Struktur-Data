package com.jobsheet12;

public class Student08 
{
    String  nim,
            name,
            className;
    double  gpa;

    public Student08() {}
    public Student08(String nm, String nama, String kls, double ip)
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
