package com.jobsheet2;

public class Course8 
{
    public static void main(String[] args) 
    {
        
    }
}

class Course 
{
    String codeCourse;
    String name;
    int credits;
    int numberOfHours;

    void showInformation()
    {
        System.out.println("Code Course: " + codeCourse);
        System.out.println("Name: " + name);
        System.out.println("Credits: " + credits);
        System.out.println("Number of Hours: " + numberOfHours + " hours\n");
    }

    void updateCredits(int newCredits) 
    {
        credits = newCredits;
    }

    void addHour(int hours)
    {
        numberOfHours += hours;
    }

    void reduceHours(int hours)
    {
        if (hours > numberOfHours) 
        {
            System.out.println("Cannot reduce hours. Not enough hours available.\n");
        } 
        else 
        {
            numberOfHours -= hours;
        }
    }

    Course() 
    {

    }

    Course(String codeCourse, String name, int credits, int numberOfHours) 
    {
        this.codeCourse = codeCourse;
        this.name = name;
        this.credits = credits;
        this.numberOfHours = numberOfHours;
    }
}
