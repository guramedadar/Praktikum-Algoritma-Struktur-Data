package com.jobsheet6;

public class Lecturer
{
    String id;
    String name;
    Boolean gender;
    int age;

    public Lecturer() {}

    public Lecturer(String id, String name, Boolean gender, int age)
    {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.age = age;
    }

    public void print()
    {
        String genderStr = (gender) ? "Male" : "Female";
        System.out.println("ID: " + id + ", Name: " + name +
                           ", Gender: " + genderStr + ", Age: " + age);
    }
}