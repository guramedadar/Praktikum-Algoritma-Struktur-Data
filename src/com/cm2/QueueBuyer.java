package com.cm2;

public class QueueBuyer 
{
    NodeBuyer   head, 
                tail;
    int         size = 0;

    boolean isEmpty() 
    {
        return head == null;
    }

    void enqueue (Buyer b) 
    {
        NodeBuyer newNode = new NodeBuyer(b);

        if (isEmpty())
            head = tail = newNode;
        else 
        {
            tail.next       = newNode;
            newNode.prev    = tail;
            tail            = newNode;
        }

        size++;
        System.out.println("Queue successfully added with number: " + b.queueNumber);
    }

    Buyer dequeue() 
    {
        if (isEmpty()) 
        {
            System.out.println("Queue is empty!");
            return null;
        }

        Buyer removed = head.data;
        head = head.next;

        if (head != null) 
            head.prev = null;
        else 
            tail = null;

        size--;
        return removed;
    }

    void printQueue() 
    {
        if (isEmpty()) 
        {
            System.out.println("Queue is empty!");
            return;
        }

        System.out.println("List of Buyers in Queue:");

        NodeBuyer tmp = head;

        while (tmp != null) 
        {
            System.out.println(tmp.data.queueNumber + " | " + tmp.data.name + " | " + tmp.data.mobile);
            tmp = tmp.next;
        }
    }
}
