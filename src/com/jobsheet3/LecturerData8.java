package com.jobsheet3;

public class LecturerData8 
{
    void dataAllLecturer(Lecturer8[] arrayOfLecturer)
    {
        for (Lecturer8 lecturer : arrayOfLecturer) 
        {
            lecturer.printInfo();
        }
    }

    void numberOfLecturersPerGender(Lecturer8[] arrayOfLecturer)
    {
        int male = 0,
            female = 0;

        for (Lecturer8 lecturer : arrayOfLecturer) 
        {
            if (lecturer.gender) 
            {
                male++;
            }
            else
            {
                female++;
            }
        }

        System.out.println("Number of Male Lecturer: " + male);
        System.out.println("Number of Female Lecturer: " + female);
    }

    void averageAgeOfLecturersPerGender(Lecturer8[] arrayOfLecturer) 
    {
        int male = 0, 
            female = 0;
        int maleSum = 0, 
            femaleSum = 0;
        for (Lecturer8 lecturer : arrayOfLecturer) {
            if (lecturer.gender) {
                male++;
                maleSum += lecturer.age;
            } else {
                female++;
                femaleSum += lecturer.age;
            }
        }
        if (male > 0)
            System.out.println("Average Male Age: " + (maleSum / male));
        if (female > 0)
            System.out.println("Average Female Age: " + (femaleSum / female));
    }

    void infoTheOldestLecturers(Lecturer8[] arrayOfLecturer) 
    {
        Lecturer8 oldest = arrayOfLecturer[0];
        for (Lecturer8 lecturer : arrayOfLecturer) 
        {
            if (lecturer.age > oldest.age) oldest = lecturer;
        }
        System.out.println("Oldest Lecturer: ");
        oldest.printInfo();
    }

    public void infoTheYoungestLecturer(Lecturer8[] arrayOfLecturer) 
    {
        Lecturer8 youngest = arrayOfLecturer[0];
        for (Lecturer8 lecturer : arrayOfLecturer) {
            if (lecturer.age < youngest.age) youngest = lecturer;
        }
        System.out.println("Youngest Lecturer:");
        youngest.printInfo();
    }

}
