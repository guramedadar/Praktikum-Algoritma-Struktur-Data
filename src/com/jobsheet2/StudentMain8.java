package com.jobsheet2;

public class StudentMain8 
{
    public static void main(String[] args) 
    {
        Student std1 = new Student();
        std1.name = "Muhammad Ali Farhan";
        std1.nim = "2241720171";
        std1.class_student = "SI 2J";
        std1.ipk = 3.55f;

        std1.displayInformation();
        std1.changeClass("SI 2K");
        std1.updateIPK(3.60f);
        std1.displayInformation();
        
        Student std2 = new Student("Annisa Nabila", "2141720160", 3.25f, "TI 2L");
        std2.updateIPK(3.30f);
        std2.displayInformation();
    }
}
