package com.jobsheet10;

public class Student8 
{
    String  name,
            className,
            nim;
    int     grade;

    Student8(String nim, String name, String className) 
    {
        this.nim = nim;
        this.name = name;
        this.className = className;
        this.grade = -1;
    }

    void grading (int grade)
    {
        this.grade = grade;
    }
}
