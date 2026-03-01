package com.jobsheet3;

import java.util.Scanner;

public class Course8 
{
    public String code;
    public String name;
    public int credits;
    public int totalHours;
    String dummy;

    void addData(Scanner sc, int i)
    {
        System.out.println("Enter data for course " + (i + 1) + ":");
        System.out.print("Code\t\t: ");
        code = sc.nextLine();
        System.out.print("Name\t\t: ");
        name = sc.nextLine();
        System.out.print("Credits\t\t: ");
        dummy = sc.nextLine();
        credits = Integer.parseInt(dummy);
        System.out.print("Total Hours\t: ");
        dummy = sc.nextLine();
        totalHours = Integer.parseInt(dummy);
                    
        System.out.println("------------------------------");
    }

    void printInfo()
    {
        System.out.println("Code\t\t: " + code);
        System.out.println("Name\t\t: " + name);
        System.out.println("Credits\t\t: " + credits);
        System.out.println("Total Hours\t: " + totalHours);
        System.out.println("------------------------------");
    }
}


// public Course8(String code, String name, int credits, int totalHours) 
    // {
    //     this.code = code;
    //     this.name = name;
    //     this.credits = credits;
    //     this.totalHours = totalHours;
    // }