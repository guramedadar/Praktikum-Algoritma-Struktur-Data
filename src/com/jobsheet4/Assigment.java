package com.jobsheet4;

public class Assigment 
{
    public static void main(String[] args) 
    {
        System.out.println("=== STUDENT SCORE ANALYSIS ===\n");
        
        StudentScores student = new StudentScores();

        int maxIdx = student.Highest (student.uts, 0, student.uts.length - 1);
        System.out.println("a) Highest Midterm Score (UTS) - Divide & Conquer");
        System.out.println("   Student : " + student.names[maxIdx]);
        System.out.println("   NIM     : " + student.nim[maxIdx]);
        System.out.println("   Score   : " + student.uts[maxIdx]);
        System.out.println();

        int minIdx = student.Lowest (student.uts, 0, student.uts.length - 1);
        System.out.println("b) Lowest Midterm Score (UTS) - Divide & Conquer");
        System.out.println("   Student : " + student.names[minIdx]);
        System.out.println("   NIM     : " + student.nim[minIdx]);
        System.out.println("   Score   : " + student.uts[minIdx]);
        System.out.println();

        float avg = student.Average(student.uas);
        int sum = 0;
        for (int s : student.uas) sum += s;
        System.out.println("c) Average Final Score (UAS) - Brute Force");
        System.out.printf ("   Sum     : %d%n", sum);
        System.out.printf ("   Count   : %d students%n", student.uas.length);
        System.out.printf ("   Average : %.3f%n", avg);
    }
}

class StudentScores
{
    String[] names = {"Ahmad", "Budi", "Cindy", "Dian", "Eko", "Fajar", "Gina", "Hadi"};
    String[] nim    = {"220101001","220101002","220101003","220101004", "220101005","220101006","220101007","220101008"};
    int[] uts = {78, 85, 90, 76, 92, 88, 80, 82};
    int[] uas = {82, 88, 87, 79, 95, 85, 83, 84};

    int Highest (int[] arr, int left, int right) 
    {
        if (left == right) return left;
 
        int mid = (left + right) / 2;
        int leftMax  = Highest (arr, left, mid);
        int rightMax = Highest (arr, mid + 1, right);
 
        return arr[leftMax] >= arr[rightMax] ? leftMax : rightMax;
    }

    int Lowest (int[] arr, int left, int right)
    {
        if (left == right) return left;
 
        int mid = (left + right) / 2;
        int leftMin  = Lowest (arr, left, mid);
        int rightMin = Lowest (arr, mid + 1, right);
 
        return arr[leftMin] <= arr[rightMin] ? leftMin : rightMin;
    }

    float Average(int[] arr) 
    {
        int total = 0;
        for (int i = 0; i < arr.length; i++) 
        {
            total += arr[i];
        }
        return (float) total / arr.length;
    }
}
