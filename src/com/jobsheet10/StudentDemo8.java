package com.jobsheet10;
import java.util.Scanner;
public class StudentDemo8 
{
    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);

        StudentAssigmentStack8 stack = new StudentAssigmentStack8(5);

        int select;

        do 
        {
            System.out.println
            (
                "\nMenu: \n" +
                "1. Submitting Assignments\n" +
                "2. Assessing Assignments\n" +
                "3. View Top Assigment\n" +
                "4. View the To-Do List\n" +
                "0. Exit"
            ); 

            System.out.print("Select: ");
            select = scan.nextInt();
            scan.nextLine();

            switch (select) 
            {
                case 1:
                    System.out.print("\nName: ");
                    String name = scan.nextLine();
                    System.out.print("NIM: ");
                    String nim = scan.nextLine();
                    System.out.print("Class: ");
                    String studentClass = scan.nextLine();

                    Student8 std = new Student8(nim, name, studentClass);
                    stack.push(std);

                    System.out.printf("%s's assignment has been successfully submitted\n", std.name);
                    break;
                    
                case 2:
                    Student8 assessed = stack.pop();
                    if (assessed != null) 
                    {
                        System.out.printf("\nViewing %s assignment\n", assessed.name);
                        System.out.print("Input the value (0-100): ");
                        int value = scan.nextInt();
                        assessed.grading(value);
                        System.out.printf("%s mark for the assignment is %d\n", assessed.name, value);
                    }
                    break;

                case 3:
                    Student8 see =  stack.peek();
                    if (see != null)
                        System.out.println("The final assignment was handed in by " + see.name);
                    break;

                case 4:
                    System.out.println
                    (
                        "\nList of Assigments\n" +
                        "Name\tNIM\tClass"
                    );
                    stack.print();
                    break;
                    
                case 0:
                    System.out.println("Thankyou :D");
                    return;

                default:
                    System.out.println("Invalid selection");
                    continue;
            }
        } while (select >= 1 && select <= 4);

        scan.close();
    }    
}
