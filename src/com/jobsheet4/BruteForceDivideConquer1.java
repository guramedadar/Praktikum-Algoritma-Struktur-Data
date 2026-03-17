package com.jobsheet4;

import java.util.Scanner;

public class BruteForceDivideConquer1 
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);

        System.out.print("Input a number: ");
        int num = input.nextInt();

        Factorial fk = new Factorial();
        System.out.println("The factorial of " + num + " using BF: " + fk.factorialBF(num));
        System.out.println("The factorial of " + num + " using DC: " + fk.factorialDC(num));

        input.close();
    }
}

class Factorial
{

    int factorialBF(int n) 
    {
        int facto = 1;
        int i = 1;
        while (i <= n)
        {
            facto = facto * i;
            i++;
        }
        return facto;
    }

    // int factorialBF (int n)
    // {
    //     int facto = 1;
    //     for (int i = 1; i <= n ; i++) 
    //     {
    //         facto = facto * i;    
    //     }
    //     return facto;
    // }

    int factorialDC(int n)
    {
        if (n == 1) 
        {
            return 1;    
        }
        else
        {
            int facto = n * factorialDC(n - 1);
            return facto;
        }
    }
}
