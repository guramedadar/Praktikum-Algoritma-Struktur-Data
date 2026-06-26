package com.jobsheet14;

public class BinaryTreeArrayMain8 
{
    public static void main(String[] args) 
    {
        BinaryTreeArray8 bta = new BinaryTreeArray8();

        Student8 m1 = new Student8("244107020138", "Devin", "TI-1I", 3.57);
        Student8 m2 = new Student8("244107020023", "Dewi", "TI-1I", 3.85);
        Student8 m3 = new Student8("244107020225", "Wahyu", "TI-1I", 3.21);
        Student8 m4 = new Student8("244107020076", "Angelina", "TI-1I", 3.54);
        Student8 m5 = new Student8("244107020223", "Andhika", "TI-1I", 3.72);
        Student8 m6 = new Student8("244107020226", "Bima", "TI-1I", 3.37);
        Student8 m7 = new Student8("244107020181", "Eiyu", "TI-1I", 3.46);

        Student8[] data = {m1, m2, m3, m4, m5, m6, m7};
        bta.populateData(data, data.length - 1);
        System.out.println("In-order traversal:");
        bta.traverseInOrder(0);

        System.out.println("--- Array Tree Pre-Order Traversal ---");
        bta.traversePreOrder(0);
    }    
}
