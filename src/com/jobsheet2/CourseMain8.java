package com.jobsheet2;

public class CourseMain8 
{
    public static void main(String[] args) 
    {
        Course course1 = new Course();
        
        course1.codeCourse = "PASD01";
        course1.name = "Algorithms & Data Structures Practicum";
        course1.credits = 2;
        course1.numberOfHours = 6;

        course1.showInformation();

        course1.updateCredits(3);
        course1.addHour(2);
        course1.showInformation();

        course1.reduceHours(4);
        course1.showInformation();

        course1.reduceHours(10);

        Course course2 = new Course("PBO02", "Object Oriented Programming", 3, 4);
        course2.showInformation();

        course2.updateCredits(1);
        course2.addHour(3);
        course2.showInformation();

        course2.reduceHours(4);
        course2.showInformation();

        course2.reduceHours(5);
    }
    
}
