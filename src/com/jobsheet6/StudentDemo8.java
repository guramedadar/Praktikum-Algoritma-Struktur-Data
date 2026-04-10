package com.jobsheet6;

public class StudentDemo8 
{
    public static void main(String[] args)
    {
        TopStudents8 topStudents = new TopStudents8();
        topStudents.listStudents = new Student8[5];

        topStudents.add(new Student8("2201", "Alice", "A", 3.9));
        topStudents.add(new Student8("2202", "Bob", "B", 3.7));
        topStudents.add(new Student8("2203", "Charlie", "C", 3.8));
        topStudents.add(new Student8("2204", "David", "D", 3.6));
        topStudents.add(new Student8("2205", "Eve", "E", 4.0));

        System.out.println("Original student list:");
        topStudents.print();

        topStudents.bubbleSort();
        System.out.println("Sorted student list (by GPA, descending):");
        topStudents.print();

        topStudents.selectionSort();
        System.out.println("Sorted student list (by GPA, ascending), using Selection Sort:");
        topStudents.print();

        topStudents.insertionSort();
        System.out.println("Sorted student list (by GPA, ascending), using Insertion Sort:");
        topStudents.print();
    }    
}
