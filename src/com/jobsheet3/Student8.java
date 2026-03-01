package com.jobsheet3;

public class Student8 
{
    public String nim;
    public String name;
    public String student_class;
    public float ipk;

    void printInfo(int i)
    {
        System.out.println("Data for student " + (i + 1) + ":");
        System.out.println("NIM\t: " + nim);
        System.out.println("Name\t: " + name);
        System.out.println("Class\t: " + student_class);
        System.out.println("IPK\t: " + ipk);
        System.out.println("------------------------------");
    }
}
