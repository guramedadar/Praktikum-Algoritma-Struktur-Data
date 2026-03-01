package com.jobsheet3;

import java.util.Scanner;

public class Lecturer8 
{
    String code;
    String name;
    boolean gender;
    int age;

    Lecturer8(String code, String name, boolean gender, int age)
    {
        this.code = code;
        this.name = name;
        this.gender = gender;
        this.age = age;
    }

    void inputData(Scanner sc)
    {
        System.out.print("Input Lecturer Code: ");
        this.code = sc.next();
        sc.nextLine();
        System.out.print("Input Lecturer Name: ");
        this.name = sc.nextLine();
        System.out.print("Input Lecturer Gender (true for male, false for female): ");
        this.gender = sc.nextBoolean();
        System.out.print("Input Lecturer Age: ");
        this.age = sc.nextInt();
        sc.nextLine(); 
    }

    void printInfo()
    {
        System.out.println("Lecturer Code\t: " + code);
        System.out.println("Lecturer Name\t: " + name);
        System.out.println("Lecturer Gender\t: " + (gender ? "Male" : "Female"));
        System.out.println("Lecturer Age\t: " + age);
        System.out.println("------------------------------");
    }
}