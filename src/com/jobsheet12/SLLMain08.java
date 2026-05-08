package com.jobsheet12;

public class SLLMain08 
{
    public static void main(String[] args) 
    {
        SingleLinkedList08 sll = new SingleLinkedList08();

        Student08 std1 = new Student08("001", "Student 1" , "TI-1I" , 3.89);
        Student08 std2 = new Student08("002", "Student 2" , "TI-1I" , 3.45);
        Student08 std3 = new Student08("003", "Student 3" , "TI-1I" , 3.89);
        Student08 std4 = new Student08("004", "Student 4" , "TI-1I" , 3.00);

        sll.print();
        sll.addFirst(std4);
        sll.print();
        sll.addLast(std1);
        sll.print();
        sll.insertAfter(std3, "Student 4");
        sll.inserAt(2, std2);
        sll.print();
    }
}
