package com.jobsheet11;

import java.util.Scanner;

public class KRSMain 
{

    static void menu() 
    {
        System.out.print
        (
            """
            
            ======================================
            COURSE REGISTRATION APPROVAL QUEUE SYSTEM
            ======================================
            1.  Add Student
            2.  Course Registration Approval Process (2 Students)
            3.  Show All Students in the Queue
            4.  Show 2 Top/Front Students
            5.  Show Students at the Back/Rear
            6.  Check Queue
            7.  Show the Number of Students in the Queue
            8.  Show the Number of Students who have Completed their Course Registration
            9.  Show the Number of Students who have not yet Registered
            10. Clear the Queue
            0.  Exit
            """
        );    
    }

    static void StdChar() 
    {
        System.out.println("NIM     Name        Study Program   Class");
    }

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        KRSQueue queue = new KRSQueue(10);

        int choice;
        do 
        { 
            menu();
            System.out.print("Choose a menu: ");
            choice = sc.nextInt();
            sc.nextLine();
            
            switch (choice) 
            {
                case 1:
                    System.out.print("NIM           : ");
                    String nim = sc.nextLine();
                    System.out.print("Name          : ");
                    String name = sc.nextLine();
                    System.out.print("Study Program : ");
                    String studyProgram = sc.nextLine();
                    System.out.print("Class         : ");
                    String className = sc.nextLine();

                    KRSStudent std = new KRSStudent(nim, name, studyProgram, className);
                    queue.enqueue(std);
                    break;

                case 2:
                    int oldFront = queue.front;
                    KRSStudent studentApprove = queue.dequeue();
                    if (studentApprove != null) 
                    {
                        System.out.println("2 Student has been aproved:");
                        StdChar();
                        int newFront = (oldFront + 1) % queue.max;
                        queue.studentData[oldFront].print();
                        queue.studentData[newFront].print();
                    }
                    break;

                case 3:
                    StdChar();
                    queue.showAll();
                    break;

                case 4:
                    System.out.println("2 Front Student is:");
                    StdChar();
                    queue.peek();
                    break;

                case 5:
                    System.out.println("Rear data: ");
                    StdChar();
                    queue.viewRear();
                    break;

                case 6:
                    queue.check();
                    break;

                case 7:
                    System.out.println("Total Number of Student in Queue: " + queue.size);
                    break;

                case 8:
                    System.out.println("Total Number of Student has been approved: " + queue.krsSize);
                    break;

                case 9:
                    System.out.println("Total Number of Student has not been approved: " + queue.krsRemain);
                    break;

                case 10:
                    queue.clear();
                    break;

                case 0:
                    System.out.println("Thank you!");
                    sc.close();
                    break;

                default:
                    System.out.println("Input Invalid!!!");
            }
        } 
        while (choice != 0);
            
    }    
}
