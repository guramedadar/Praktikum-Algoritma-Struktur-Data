package com.jobsheet3;

import java.util.Scanner;

public class StudentDemo8 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        Student8[] arrayOfStudents = new Student8[3];
        String dummy;

        for (int i = 0; i < 3; i++) 
        {
            arrayOfStudents[i] = new Student8();

            System.out.println("Enter data for student " + (i + 1) + ":");
            System.out.print("NIM: ");
            arrayOfStudents[i].nim = sc.nextLine();
            System.out.print("Name: ");
            arrayOfStudents[i].name = sc.nextLine();
            System.out.print("Class: ");
            arrayOfStudents[i].student_class = sc.nextLine();
            System.out.print("IPK: ");
            dummy = sc.nextLine();
            arrayOfStudents[i].ipk = Float.parseFloat(dummy);
            System.out.println("------------------------------");
        }

        for (int i = 0; i < 3; i++) 
        {
            arrayOfStudents[i].printInfo(i);
        }
        
        sc.close();
    }
}

//         arrayOfStudents[0] = new Student8();
//         arrayOfStudents[0].nim = "244107060033";
//         arrayOfStudents[0].name = "AGNES TITANIA KINANTI";
//         arrayOfStudents[0].student_class = "SIB-1E";
//         arrayOfStudents[0].ipk = 3.75f;

//         arrayOfStudents[1] = new Student8();
//         arrayOfStudents[1].nim = "2341720172";
//         arrayOfStudents[1].name = "ACHMAD MAULANA HAMZAH";
//         arrayOfStudents[1].student_class = "TI-2A";
//         arrayOfStudents[1].ipk = 3.36f;

//         arrayOfStudents[2] = new Student8();
//         arrayOfStudents[2].nim = "244107023006";
//         arrayOfStudents[2].name = "DIRHAMAWAN PUTRANTO";
//         arrayOfStudents[2].student_class = "TI-1E";
//         arrayOfStudents[2].ipk = 3.80f;

//         System.out.println("NIM\t: " + arrayOfStudents[0].nim);
//         System.out.println("Name\t: " + arrayOfStudents[0].name);
//         System.out.println("Class\t: " + arrayOfStudents[0].student_class);
//         System.out.println("IPK\t: " + arrayOfStudents[0].ipk);
//         System.out.println("------------------------------");
//         System.out.println("NIM\t: " + arrayOfStudents[1].nim);
//         System.out.println("Name\t: " + arrayOfStudents[1].name);
//         System.out.println("Class\t: " + arrayOfStudents[1].student_class);
//         System.out.println("IPK\t: " + arrayOfStudents[1].ipk);
//         System.out.println("------------------------------");
//         System.out.println("NIM\t: " + arrayOfStudents[2].nim);
//         System.out.println("Name\t: " + arrayOfStudents[2].name);
//         System.out.println("Class\t: " + arrayOfStudents[2].student_class);
//         System.out.println("IPK\t: " + arrayOfStudents[2].ipk);
//         System.out.println("------------------------------");