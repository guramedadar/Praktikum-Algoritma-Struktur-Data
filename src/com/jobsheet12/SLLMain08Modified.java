package com.jobsheet12;

import java.util.Scanner;

public class SLLMain08Modified 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        SingleLinkedList08 sll = new SingleLinkedList08();

        System.out.print("Input NIM: ");
        String nim = sc.nextLine();
        System.out.print("Input Name: ");
        String name = sc.nextLine();
        System.out.print("Input Class: ");
        String className = sc.nextLine();
        System.out.print("Input GPA: ");
        double gpa = sc.nextDouble();

        Student08 newStd = new Student08(nim, name, className, gpa);
        sll.addLast(newStd);

        Student08 std1 = new Student08("001", "Student 1" , "TI-1I" , 3.89);
        Student08 std2 = new Student08("002", "Student 2" , "TI-1I" , 3.45);
        Student08 std3 = new Student08("003", "Student 3" , "TI-1I" , 3.89);
        Student08 std4 = new Student08("004", "Student 4" , "TI-1I" , 3.00);

        sll.print();
        sll.addFirst(std4);
        sll.print();
        sll.addLast(std1);
        sll.print();
        sll.insertAfter(std3, "Student 4");
        sll.inserAt(2, std2);
        sll.print();
    }    
}
