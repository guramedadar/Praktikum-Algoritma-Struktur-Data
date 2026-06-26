package com.finalExam;

import java.util.Scanner;

public class MainProgram 
{
    static void menu()
    {
        System.out.println("\n== Tax Payment Program ==");
        System.out.println("1. Pay Vehicle Tax");
        System.out.println("2. Display All Transaction & Total Transaction");
        System.out.println("0. Exit");
        System.out.print("Select: ");
    }

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        DLLVehicle dv = new DLLVehicle();
        DLLTax dTax = new DLLTax();

        dv.addVehicleData(new Vehicle("A1234AA", "Deras", "2 wheels", 150, 2022, 3));
        dv.addVehicleData(new Vehicle("B1234BB", "Wendry", "4 wheels", 2000, 2021, 5));
        dv.addVehicleData(new Vehicle("C1234CC", "Yoga", "2 wheels", 90, 2023, 2));
        dv.addVehicleData(new Vehicle("D1234DD", "Kuol", "4 wheels", 3000, 2020, 8));

        int select;
        do 
        { 
            menu(); 
            select = sc.nextInt(); 
            sc.nextLine();

            switch (select) 
            {        
                case 1:
                    System.out.print("Input Vehicle TNKB: ");
                    String tnkb = sc.nextLine();

                    Vehicle sv = dv.searchVehicleTNKB(tnkb);
                    
                    if (sv == null)
                        System.out.println("Vehicle is not found!!");
                    else 
                    {
                        System.out.print("Input Month of Payment (1-12): ");
                        int monthPay = sc.nextInt();
                        sc.nextLine();
                        
                        Tax newTax = new Tax(sv, monthPay);
                        dTax.addTaxTransaction(newTax);
                        
                        System.out.println("Tax has been pay!!!");
                    }
                    break;
                    
                case 2:
                    dTax.displayAll(); 
                    break;
                    
                case 0:
                    System.out.println("Thanks!!");
                    break;
                    
                default:
                    System.out.println("Input Invalid!! Please, Try Again!");
            }
        } 
        while (select != 0);
        
        sc.close();        
    }
}
