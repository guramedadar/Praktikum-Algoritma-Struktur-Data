package com.jobsheet3;

import java.util.Scanner;

public class LecturerDemo8 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Input the number of Lecturer: ");
        int n = sc.nextInt();
        System.out.println("------------------------------");

        Lecturer8[] lecturer1 = new Lecturer8[n];

        for (int i = 0; i < n; i++) 
        {
            System.out.println("Input data for Lecturer " + (i+1) + ":");
            lecturer1[i] = new Lecturer8("", "", false, 0);
            lecturer1[i].inputData(sc);
            System.out.println("------------------------------");
        }

        LecturerData8 lecturer2 = new LecturerData8();

        System.out.println("\n=== All Lecturers ===");
        lecturer2.dataAllLecturer(lecturer1);

        System.out.println("\n=== Number per Gender ===");
        lecturer2.numberOfLecturersPerGender(lecturer1);

        System.out.println("\n=== Average Age per Gender ===");
        lecturer2.averageAgeOfLecturersPerGender(lecturer1);

        System.out.println("\n=== Oldest Lecturer ===");
        lecturer2.infoTheOldestLecturers(lecturer1);

        System.out.println("\n=== Youngest Lecturer ===");
        lecturer2.infoTheYoungestLecturer(lecturer1);



        

        sc.close();
    }
}
