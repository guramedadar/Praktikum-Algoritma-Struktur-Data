package com.jobsheet6;

public class LecturerData
{
    Lecturer[] lecturerData;
    int idx;

    public LecturerData()
    {
        lecturerData = new Lecturer[10];
        idx = 0;
    }

    // Add lecturer to the list
    public void add(Lecturer dsn)
    {
        if (idx < lecturerData.length)
        {
            lecturerData[idx] = dsn;
            idx++;
        }
        else
        {
            System.out.println("List is full!");
        }
    }

    // Display all lecturers
    public void print()
    {
        if (idx == 0)
        {
            System.out.println("No data available.");
            return;
        }
        for (int i = 0; i < idx; i++)
        {
            lecturerData[i].print();
        }
    }

    // Sort ASC by age using Bubble Sort (youngest to oldest)
    public void sortingASC()
    {
        for (int i = 0; i < idx - 1; i++)
        {
            for (int j = 0; j < idx - i - 1; j++)
            {
                if (lecturerData[j].age > lecturerData[j + 1].age)
                {
                    Lecturer temp = lecturerData[j];
                    lecturerData[j] = lecturerData[j + 1];
                    lecturerData[j + 1] = temp;
                }
            }
        }
    }

    // Sort DSC by age using Insertion Sort (oldest to youngest)
    public void sortingDSC()
    {
        for (int i = 1; i < idx; i++)
        {
            Lecturer temp = lecturerData[i];
            int j = i;

            while (j > 0 && lecturerData[j - 1].age < temp.age)
            {
                lecturerData[j] = lecturerData[j - 1];
                j--;
            }
            lecturerData[j] = temp;
        }
    }
}