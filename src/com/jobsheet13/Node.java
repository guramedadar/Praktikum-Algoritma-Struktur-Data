package com.jobsheet13;

public class Node 
{
    Student data;
    Node prev, next;

    public Node() {}
    public Node (Student data) 
    {
        this.data   = data;
        prev        = null;
        next        = null;
    }

    public Node(Node prev, Student data, Node next) 
    {
        this.data = data;
        this.prev = prev;
        this.next = next;
    }
}
