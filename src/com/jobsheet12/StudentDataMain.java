package com.jobsheet12;

import java.util.Scanner;

public class StudentDataMain 
{
    static void menu()
    {
            System.out.println("\n=== Queue Menu ===");
            System.out.println("1. Register (add) a students");
            System.out.println("2. Call (remove) the students");
            System.out.println("3. See Front (head) & Rear (tail)");
            System.out.println("4. Total number of students in the queue");
            System.out.println("5. Clear the queue");
            System.out.println("0. Exit");
            System.out.print("choose: ");
    }

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        LinkedListStudentQueue sll = new LinkedListStudentQueue();

        int option;
        do 
        { 
            menu();
            option = sc.nextInt(); sc.nextLine();

            switch (option) 
            {
                case 1:
                    System.out.print("NIM   : "); 
                    String nim   = sc.nextLine();
                    System.out.print("Name  : "); 
                    String name  = sc.nextLine();
                    System.out.print("Class : "); 
                    String studentClass = sc.nextLine();
                    System.out.print("GPA   : "); 
                    double gpa = sc.nextDouble(); sc.nextLine();

                    sll.addStudent(new StudentData(nim, name, studentClass, gpa));
                    System.out.println("The Student has been added in Queue");

                    break;

                case 2:
                    if (sll.isEmpty())
                        sll.printEmpty();
                    else
                    {
                        StudentData remove = sll.removeStudent();
                        System.out.printf("%s has been removed!\n", remove.name);
                    }
                    break;

                case 3:
                    if (sll.isEmpty())
                        sll.printEmpty();
                    else
                    {
                        StudentData front = sll.printHead();
                        StudentData rear  = sll.printTail();

                        System.out.print("Front : "); 
                        front.print();
                        System.out.print("Rear  : "); 
                        rear.print();
                    }

                    break;

                case 4:
                    System.out.println("Total : " + sll.printSize());
                    break;

                case 5:
                    sll.clear();
                    System.out.println("The Queue has been cleared.");
                    break;

                case 0:
                    System.out.println("Thanks!!");
                    break;
                
                default:
                    System.out.println("Input Invalid!! Please, Try Again!");
            }
        } 
        while (option != 0);

        sc.close();
    }    
}
