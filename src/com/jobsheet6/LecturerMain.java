package com.jobsheet6;

import java.util.Scanner;

public class LecturerMain
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        LecturerData data = new LecturerData();
        int choice;

        do
        {
            System.out.println("\n========== LECTURER MENU ==========");
            System.out.println("1. Add Data");
            System.out.println("2. Display Data");
            System.out.println("3. Sort ASC (Youngest to Oldest) - Bubble Sort");
            System.out.println("4. Sort DSC (Oldest to Youngest) - Insertion Sort");
            System.out.println("0. Exit");
            System.out.print("Choose an option: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // consume newline

            switch (choice)
            {
                case 1:
                    System.out.println("--- Add Lecturer ---");
                    System.out.print("ID     : ");
                    String id = scanner.nextLine();

                    System.out.print("Name   : ");
                    String name = scanner.nextLine();

                    System.out.print("Gender (true = Male, false = Female): ");
                    Boolean gender = scanner.nextBoolean();
                    scanner.nextLine();

                    System.out.print("Age    : ");
                    int age = scanner.nextInt();
                    scanner.nextLine();

                    data.add(new Lecturer(id, name, gender, age));
                    System.out.println("Lecturer added successfully!");
                    break;

                case 2:
                    System.out.println("--- Lecturer List ---");
                    data.print();
                    break;

                case 3:
                    data.sortingASC();
                    System.out.println("--- Sorted by Age (ASC) using Bubble Sort ---");
                    data.print();
                    break;

                case 4:
                    data.sortingDSC();
                    System.out.println("--- Sorted by Age (DSC) using Insertion Sort ---");
                    data.print();
                    break;

                case 0:
                    System.out.println("Exiting programme. Goodbye!");
                    break;

                default:
                    System.out.println("Invalid option. Please try again.");
            }

        } while (choice != 0);

        scanner.close();
    }
}