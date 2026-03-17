package com.quiz1;

import java.util.Scanner;

public class AccessoriesMain8
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        
        Accessories8[] perhiasan1 = new Accessories8[5];

        for (int i = 0; i < perhiasan1.length; i++) 
        {
            perhiasan1[i] = new Accessories8("", "", 0, 0, 0);
            
            System.out.println("Input accessories " + (i + 1));
            
            System.out.print("Name: ");
            perhiasan1[i].name = sc.nextLine();
            System.out.print("Category: ");
            perhiasan1[i].category = sc.nextLine();
            System.out.print("Price: ");
            perhiasan1[i].price = sc.nextInt();
            System.out.print("Sold: ");
            perhiasan1[i].sold = sc.nextInt();
            System.out.print("Stock: ");
            perhiasan1[i].stock = sc.nextInt();
            sc.nextLine();
            System.out.println("---------------------------");
        }
        
        for (int i = 0; i < perhiasan1.length; i++) 
        {
            perhiasan1[i].display();
            perhiasan1[i].checkStock();
            perhiasan1[i].calculateTotalSales();
            perhiasan1[i].displayTotal();  
        }

        sc.close();
    }
}
