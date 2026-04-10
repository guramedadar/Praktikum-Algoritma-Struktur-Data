package com.jobsheet6;
import java.util.Scanner;

public class StudentDemo8Modify
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int n = sc.nextInt();
        sc.nextLine(); // consume newline

        TopStudents8 topStudents = new TopStudents8();
        topStudents.listStudents = new Student8[n];

        for (int i = 0; i < n; i++)
        {
            System.out.println("--- Student " + (i + 1) + " ---");

            System.out.print("NIM: ");
            String nim = sc.nextLine();

            System.out.print("Name: ");
            String name = sc.nextLine();

            System.out.print("Class: ");
            String studentClass = sc.nextLine();

            System.out.print("GPA: ");
            double gpa = sc.nextDouble();
            sc.nextLine();

            topStudents.add(new Student8(nim, name, studentClass, gpa));
        }

        System.out.println("Original student list:");
        topStudents.print();
        topStudents.bubbleSort();
        System.out.println("Sorted student list (by GPA, descending):");
        topStudents.print();
        sc.close();
    }
}
