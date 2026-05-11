package com.jobsheet12;

public class LinkedListStudentQueue 
{
    NodeStudentData head, tail;
    int size;

    boolean isEmpty()
    {
        return head == null;
    }

    void printEmpty()
    {
        System.out.println("Student Data is Empty!!");
    }

    String isFull()
    {
        return "LinkedList is full!!";
    }

    void addStudent (StudentData std)
    {
        NodeStudentData newNode = new NodeStudentData(std, null);

        if (isEmpty()) 
        {
            head = newNode;
            tail = newNode;
        }
        else
        {
            tail.next = newNode;
            tail = newNode;
        }

        size++;
    }

    StudentData removeStudent()
    {
        if (isEmpty())
        {
            printEmpty();
            return null;
        }

        StudentData remove = head.data;
        head = head.next;

        if (head == null) 
            tail = null;

        size--;
        return remove;
    }

    StudentData printHead()
    {
        if (isEmpty())
        {
            printEmpty();
            return null;
        }
        else
            return head.data;
    }

    StudentData printTail()
    {
        if (isEmpty())
        {
            printEmpty();
            return null;
        }
        else
            return tail.data;
    }

    int printSize()
    {
        return size;
    }

    void clear()
    {
        head = tail = null;
        size = 0;
    }
}
