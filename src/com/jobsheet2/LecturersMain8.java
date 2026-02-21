package com.jobsheet2;

public class LecturersMain8 
{
    public static void main(String[] args) 
    {
        Lecturers lecturer1 = new Lecturers();

        lecturer1.idLecturer = "VAL001";
        lecturer1.name = "Vivin Ayu Lestari, B.Ed., M.Comp.Sc";
        lecturer1.activeStatus = true;
        lecturer1.yearOfEntry = 2015;
        lecturer1.expertiseCompetency = "Software Engineer";

        lecturer1.calculateTimeWork(2026);
        lecturer1.displayInformation();

        lecturer1.setActiveStatus(false);
        lecturer1.changeSkill("Data Scientist");
        lecturer1.displayInformation();

        Lecturers lecturer2 = new Lecturers("WIS001", "Wilda Imama Sabilla, B.Comp.Sc., M.Comp.Sc.", true, 2018, "Data Scientist");

        lecturer2.calculateTimeWork(2026);
        lecturer2.displayInformation(); 

        lecturer2.setActiveStatus(false);
        lecturer2.changeSkill("Network Engineer");
        lecturer2.displayInformation();
    }
}
