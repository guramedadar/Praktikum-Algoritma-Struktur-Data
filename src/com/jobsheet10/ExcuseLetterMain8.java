package com.jobsheet10;

import java.util.Scanner;

public class ExcuseLetterMain8 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        ExcuseLetterStack8 stack = new ExcuseLetterStack8(5);

        do 
        { 
            System.out.print
            (
                """
                \nMenu:
                1. Submit Excuse Letter
                2. Process Excuse Letter
                3. View Latest Excuse Letter
                4. Search for Letter
                0. Exit
                """
            );
            System.out.print("Select: ");
            int select = sc.nextInt();
            sc.nextLine();

            switch (select) 
            {
                case 1:
                    System.out.print("\nID: ");
                    String id = sc.nextLine();
                    System.out.print("Name: ");
                    String name = sc.nextLine();
                    System.out.print("Class: ");
                    String className = sc.nextLine();
                    System.out.print
                    (
                        """
                        Reason Leave:
                        s: Sick
                        i: Other personal reason
                        """
                    );
                    System.out.print("Select: ");
                    char type = sc.nextLine().charAt(0);
                    System.out.print("Duration (days): ");
                    int duration = sc.nextInt();
                    sc.nextLine();

                    ExcuseLetter8 ltr = new ExcuseLetter8(id, name, className, type, duration);
                    stack.push(ltr);

                    System.out.printf("%s's Excuse Letter has been successfully submitted\n", ltr.name);
                    break;

                case 2:
                    ExcuseLetter8 letter = stack.pop();
                    if (letter != null)
                    {
                        System.out.printf
                        (
                            """
                            Processing the excuse letter...
                            Name        : %s
                            Reason      : %c
                            Duration    : %d days
                            The excuse later has been verified.\n
                            """
                            , letter.name, letter.typeOfExcuse, letter.duration
                        );
                    }
                    break;

                case 3:
                    ExcuseLetter8 top = stack.peek();
                    if (top != null)
                        System.out.println("The latest excuse letter is by " + top.name + "'s letter");
                    break;

                case 4:
                    System.out.println("Search for student's letter");
                    System.out.print("Input the name: ");
                    String studentName = sc.nextLine();
                    stack.Searching(studentName);
                    break;

                case 0:
                    System.out.println("Good bye.");
                    sc.close();
                    return;

                default:
                    System.out.println("Input Invalid!! Please, Try Again!");
            }
        } 
        while (true);
    }    
}
