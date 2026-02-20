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


