package com.jobsheet11;

import java.util.Scanner;

public class QueueMain 
{
    static void menu() 
    {
        System.out.print
        (
            """
            \nAvailable menu:
            1. Enqueue
            2. Dequeue
            3. Print
            4. Peek
            5. Clear
            0. Exit
            =======================
            """
        );    
    }

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Input maximum number of data: ");
        int n = sc.nextInt();

        Queue8 Q = new Queue8(n);

        int choice = -1;
        do 
        { 
            menu();
            choice = sc.nextInt();
            switch (choice) 
            {
                case 1:
                    System.out.print("Input new data: ");
                    int newData = sc.nextInt();
                    Q.enqueue(newData);
                    break;

                case 2:
                    int outData = Q.dequeue();
                    if (outData != -1)
                    {
                        System.out.println("Removed data: " + outData);
                        break;
                    }
                    
                case 3:
                    Q.print();
                    break;

                case 4:
                    Q.peek();
                    break;

                case 5:
                    Q.clear();
                    break;

                case 0:
                    sc.close();
                    return;

                default:
                    System.out.println("Input Invalid!!!");
            }    
        } 
        while 
        (
            choice == 1 || choice == 2 || choice == 3 || 
            choice == 4 || choice == 5
        );
    }    
}
