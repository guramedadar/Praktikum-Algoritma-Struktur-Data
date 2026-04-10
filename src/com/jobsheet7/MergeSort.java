package com.jobsheet7;
import java.util.Scanner;
public class MergeSort 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Sorting with merge sort");

        System.out.print("Amount of data: ");
        int n = sc.nextInt();

        int[] data = new int[n];
        System.out.println("Initial Data");
        for (int i = 0; i < n; i++)
        {
            data[i] = sc.nextInt();
            System.out.print(data[i] + " ");
        }
        System.out.println();

        MergeSort ms = new MergeSort();
        ms.mergeSort(data);

        System.out.println("Sorted Data");
        for (int d : data)
        {
            System.out.print(d + " ");
        }
        System.out.println();

        sc.close();
    }

    public void mergeSort(int[] data)
    {
        sort(data, 0, data.length - 1);
    }
    
    public void merge(int data[], int left, int middle, int right)
    {
        int[] temp = new int[data.length];
        for (int i = left; i <= right; i++)
        {
            temp[i] = data[i];
        }

        int a = left;
        int b = middle + 1;
        int c = left;
        while (a <= middle && b <= right)
        {
            if (temp[a] <= temp[b])
            {
                data[c] = temp[a];
                a++;
            }
            else
            {
                data[c] = temp[b];
                b++;
            }
            c++;
        }

        int s = middle - a;
        for (int i = 0; i <= s; i++)
        {
            data[c + i] = temp[a + i];
        } 
    }

    private void sort(int data[], int left, int right)
    {
        if (left < right)
        {
            int mid = (left + right) / 2;
            sort(data, left, mid);
            sort(data, mid + 1, right);
            merge(data, left, mid, right); 
        }
    } 
}
