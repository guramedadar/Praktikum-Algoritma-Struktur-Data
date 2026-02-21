package com.jobsheet2;

public class Lecturers8 
{
    public static void main(String[] args) 
    {
        
    }
}

class Lecturers
{
    String idLecturer;
    String name;  
    boolean activeStatus;
    int yearOfEntry;
    String expertiseCompetency;
    int timeWork;
    
    void displayInformation()
    {
        System.out.println("ID Lecturer : " + idLecturer);
        System.out.println("Name : " + name);
        System.out.println("Active Status : " + setActiveStatus(activeStatus));
        System.out.println("Year of Entry : " + yearOfEntry);
        System.out.println("Time Work : " + timeWork + " years");
        System.out.println("Expertise Competency : " + expertiseCompetency + "\n");
    }

    String setActiveStatus(boolean status)
    {
        activeStatus = status;

        if(status == true)
        {
            return "Active";
        }
        else
        {
            return "Inactive";
        }
    }

    int calculateTimeWork(int yearNow)
    {
        timeWork = yearNow - yearOfEntry;
        return timeWork;
    }

    void changeSkill(String skill)
    {
        expertiseCompetency = skill;
    }

    public Lecturers() 
    {

    }

    public Lecturers(String idLecturer, String name, boolean activeStatus, int yearOfEntry, String expertiseCompetency) 
    {
        this.idLecturer = idLecturer;
        this.name = name;
        setActiveStatus(activeStatus);
        this.yearOfEntry = yearOfEntry;
        this.expertiseCompetency = expertiseCompetency;
    }
}
