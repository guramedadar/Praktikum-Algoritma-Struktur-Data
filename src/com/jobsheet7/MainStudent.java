package com.jobsheet7;
import java.util.Scanner;

public class MainStudent 
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);

        SearchStudent data = new SearchStudent();

        System.out.print("Enter number of students: ");
        int amountStudent = s.nextInt();

        Students[] listStd = new Students[amountStudent];

        System.out.println("------------------------------");
        System.out.println("Input student data accordingly from smallest NIM");

        for (int i = 0; i < amountStudent; i++) 
        {
            System.out.println("----------");
            System.out.print("NIM\t:");
            int nim = s.nextInt();
            s.nextLine();
            System.out.print("Name\t:");
            String name = s.nextLine();
            System.out.print("Age\t:");
            int age = s.nextInt();
            s.nextLine();
            System.out.print("GPA\t:");
            double gpa = s.nextDouble();

            Students std = new Students (nim, age, name, gpa);
            data.add(std);
        }

        System.out.println("------------------------------");
        System.out.println("Entire Student Data");
        data.display();

        System.out.println("=================");
        System.out.print("Search student by NIM: ");
        int search = s.nextInt();
        
        System.out.println("Using binary Search");
        int position1 = data.FindBinarySearch(search, 0, amountStudent - 1);

        data.showPosition(search, position1);
        data.showData(search, position1);
        
        s.close();
    }    
}



// System.out.println("______________________");
//         System.out.println("______________________");
//         System.out.print("Search student by NIM: ");
//         int search = s.nextInt();
//         System.out.println("Using Sequential Search");
//         int position = data.findSeqSearch(search);

//         data.showPosition(search, position);
//         data.showData(search, position);
