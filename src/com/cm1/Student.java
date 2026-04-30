package com.cm1;

public class Student 
{
    String nim, name, study_program, publisher;

    Student (String nim, String name, String study_program, String publisher) 
    {
        this.nim = nim;
        this.name = name;
        this.study_program = study_program;
        this.publisher = publisher;
    }

    void printStudent() 
    {
        System.out.println("NIM: " + nim + " | Name: " + name + " | Study program: " + study_program + " | Publisher: " + publisher);
    }
}
