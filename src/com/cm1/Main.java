package com.cm1;

import java.util.Scanner;

public class Main 
{
    static int nimCompare(String a, String b) 
    {
        int lenA = a.length(), lenB = b.length();
        int minLen = (lenA < lenB) ? lenA : lenB;
        for (int i = 0; i < minLen; i++) 
        {
            if (a.charAt(i) != b.charAt(i))
                return a.charAt(i) - b.charAt(i);
        }
        return lenA - lenB;
    }

    static boolean nimEquals(String a, String b) 
    {
        if (a.length() != b.length()) return false;
        for (int i = 0; i < a.length(); i++) 
        {
            if (a.charAt(i) != b.charAt(i)) return false;
        }
        return true;
    }

    static void insertionSort(BookLending[] arr) 
    {
        for (int i = 1; i < arr.length; i++) 
        {
            BookLending key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j].fine < key.fine) 
            {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
    }

    static void binarySearchByNIM(BookLending[] loans, String targetNIM) 
    {
        BookLending[] sorted = loans.clone();

        for (int i = 1; i < sorted.length; i++) 
        {
            BookLending key = sorted[i];
            int j = i - 1;
            while (j >= 0 && nimCompare(sorted[j].sdt.nim, key.sdt.nim) > 0) 
            {
                sorted[j + 1] = sorted[j];
                j--;
            }
            sorted[j + 1] = key;
        }

        int lo = 0, hi = sorted.length - 1;
        int firstFound = -1;
        while (lo <= hi) 
        {
            int mid = (lo + hi) / 2;
            int cmp = nimCompare(sorted[mid].sdt.nim, targetNIM);
            if (cmp == 0) { firstFound = mid; hi = mid - 1; }
            else if (cmp < 0) lo = mid + 1;
            else hi = mid - 1;
        }

        if (firstFound == -1) 
        {
            System.out.println("NIM " + targetNIM + " not found.");
            return;
        }
        
        for (int i = firstFound; i < sorted.length && nimEquals(sorted[i].sdt.nim, targetNIM); i++) 
        {
            sorted[i].printLending();
        }
    }

    public static void main(String[] args) 
    {
        Student[] students = 
        {
            new Student("22001", "Andi",  "Informatics Engineering", "A"),
            new Student("22002", "Budi",  "Informatics Engineering", "B"),
            new Student("22003", "Citra", "Business Information Systems", "C")
        };

        Book[] books = 
        {
            new Book("B001", "Algorithm",    2020, 1),
            new Book("B002", "Database",     2019, 2),
            new Book("B003", "Programming",  2021, 3),
            new Book("B004", "Physics",      2024, 4)
        };

        BookLending[] loans = 
        {
            new BookLending(students[0], books[0], 7),
            new BookLending(students[1], books[1], 3),
            new BookLending(students[2], books[2], 10),
            new BookLending(students[2], books[3], 6),
            new BookLending(students[0], books[1], 4)
        };

        Scanner sc = new Scanner(System.in);
        int choice;

        do 
        {
            System.out.println("\n=== JTI LIBRARY BORROWING SYSTEM ===");
            System.out.println("1. Display Students");
            System.out.println("2. Display Books");
            System.out.println("3. Display Borrowings");
            System.out.println("4. Sort by Fines");
            System.out.println("5. Search by Student ID");
            System.out.println("0. Exit");
            System.out.print("Select: ");
            choice = sc.nextInt();

            switch (choice) 
            {
                case 1:
                    System.out.println("\nStudent List:");
                    for (Student s : students) s.printStudent();
                    break;

                case 2:
                    System.out.println("\nBook List:");
                    for (Book b : books) b.printBook();
                    break;

                case 3:
                    System.out.println("\nLoan Data:");
                    for (BookLending bl : loans) bl.printLending();
                    break;

                case 4:
                    BookLending[] sorted = loans.clone();
                    insertionSort(sorted);
                    System.out.println("\nAfter sorting (Largest fine):");
                    for (BookLending bl : sorted) bl.printLending();
                    System.out.println("\nWhoose loans term exceeds 5 days:");
                    for (BookLending bl : sorted) bl.printLoansEx();
                    break;

                case 5:
                    System.out.print("Enter NIM: ");
                    String nim = sc.next();
                    binarySearchByNIM(loans, nim);
                    break;

                case 0:
                    System.out.println("Goodbye!");
                    break;

                default:
                    System.out.println("Invalid option.");
            }
        } 
        while (choice != 0);

        sc.close();
    }
}
