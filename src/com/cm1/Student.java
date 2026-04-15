package com.cm1;

public class Student 
{
    String nim, name, study_program;

    Student (String nim, String name, String study_program) 
    {
        this.nim = nim;
        this.name = name;
        this.study_program = study_program;
    }

    void printStudent() 
    {
        System.out.println("NIM: " + nim + " | Name: " + name + " | Study program: " + study_program);
    }
}
