package src.jobsheet2;

public class Student8 
{
    public static void main(String[] args) 
    {
        
    }
}

class Student 
{
    String name;
    String nim;
    String class_student;
    float ipk;

    void displayInformation() 
    {
        System.out.println("Nama: " + name);
        System.out.println("NIM: " + nim);
        System.out.println("IPK: " + ipk);
        System.out.println("Kelas: " + class_student);
    }

    void changeClass(String newClass) 
    {
        class_student = newClass;
    }

    void updateIPK(float newIpk) 
    {
        ipk = newIpk;
    }   

    String performaceScore() 
    {
        if (ipk < 0.0 || ipk > 4.0) 
        {
           return "GPA is invalid. Must be between 0.0 and 4.0";
        }
        else
        {
            if (ipk >= 3.5) 
            {
                return "Excellent performance";
            } 
            else if (ipk >= 3.0) 
            {
                return "Good performance";
            } 
            else if (ipk >= 2.5) 
            {
                return "Satisfactory performance";
            } 
            else 
            {
                return "Poor performance";
            }
        }
    }

    public Student() 
    {

    }
    
    public Student(String name, String nim, float ipk, String class_student) 
    {
        this.name = name;
        this.nim = nim;
        this.ipk = ipk;
        this.class_student = class_student;
    }

}


