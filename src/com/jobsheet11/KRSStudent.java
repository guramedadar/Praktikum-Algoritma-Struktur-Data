package com.jobsheet11;

public class KRSStudent
{
    String  nim,
            name,
            studyProgram,
            className;

    public KRSStudent(String nim, String name, String studyProgram, String className) 
    {
        this.nim = nim;
        this.name = name;
        this.studyProgram = studyProgram;
        this.className = className;
        
    }

    void print()
    {
        System.out.println(nim + "\t\t" + name + "\t\t\t" + studyProgram + "\t\t\t\t" + className);
    }
}

