package com.jobsheet12;

public class NodeStudentData 
{
    StudentData     data;
    NodeStudentData next;
    
    public NodeStudentData (StudentData data, NodeStudentData next)
    {
        this.data = data;
        this.next = next;
    }
}
