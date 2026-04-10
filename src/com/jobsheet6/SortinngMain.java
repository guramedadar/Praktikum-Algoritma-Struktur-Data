package com.jobsheet6;

public class SortinngMain 
{
    public static void main(String[] args) 
    {
        int[] a = {34, 7, 23, 32, 5, 62};
        int[] b = {30, 20, 2, 8, 14};
        int c[] = {40, 10, 4, 9, 3};

        Sorting8 sorting = new Sorting8(a);
        Sorting8 sorting2 = new Sorting8(b);
        Sorting8 sorting3 = new Sorting8(c);

        System.out.println("Original Array:");
        sorting.print();
        sorting.bubbleSort();
        System.out.println("Sorted array (Bubble Sort):");
        sorting.print();

        System.out.println("Original Array:");
        sorting2.print();
        sorting2.selectionSort();
        System.out.println("Sorted array (Selection Sort):");
        sorting2.print();

        System.out.println("Original Array:");
        sorting3.print();
        sorting3.insertionSort();
        System.out.println("Sorted array (Insertion Sort):");
        sorting3.print();
    }
}
