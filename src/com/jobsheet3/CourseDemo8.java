package com.jobsheet3;

import java.util.Scanner;

public class CourseDemo8 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Course Data Input: ");
        int totalCourses = sc.nextInt();
        System.out.println("------------------------------");

        Course8[] arrayOfCourses = new Course8[totalCourses];

        for (int i = 0; i < arrayOfCourses.length; i++) 
        {
            arrayOfCourses[i] = new Course8();
            arrayOfCourses[i].addData(sc, i);
        }

        for (int i = 0; i < arrayOfCourses.length; i++) 
        {
            System.out.println("Course " + (i + 1) + ":");
            arrayOfCourses[i].printInfo();
        }

        sc.close();
    }
}
