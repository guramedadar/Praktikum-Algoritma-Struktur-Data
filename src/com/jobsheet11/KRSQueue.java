package com.jobsheet11;

public class KRSQueue 
{
    KRSStudent[] studentData;
    int front,
        rear,
        size,
        max,
        krsSize,
        krsRemain,
        krsMax;

    public KRSQueue(int n) 
    {
        max = n;
        studentData = new KRSStudent[max];
        size = 0;
        front = -1;
        rear = -1;
        krsMax = 30;
        krsRemain = 30;
        krsSize = 0;
    }

    boolean isEmpty()
    {
        return size == 0;
    }

    boolean isFull()
    {
        return size == max;
    }

    boolean isFullKRS()
    {
        return krsSize == krsMax;
    }

    void enqueue(KRSStudent dt)
    {
        if (isFull())
        {
            System.out.println("Queue is full!!!");
            return;
        }
        
        rear = (rear + 1) % max;
        studentData[rear] = dt;
        size++;

        if (size == 1)
            front = rear;

        System.out.printf("%s is successfully added at index %d\n", dt.name, rear);
    }

    KRSStudent dequeue()
    {
        if (isEmpty()) 
        {
            System.out.println("Queue is empty!!!");
            return null;
        }
        else if (size == 1) 
        {
            System.out.print
            (
                """
                The course registration process has failed!
                A minimum of 2 students is required in the queue.
                """
            );
            return null;
        }
        else if (isFullKRS())
        {
            System.out.print
            (
                """
                Course Registration System (KRS) error!
                The DPA has reached its maximum capacity.
                """
            );
            return null;
        }

        KRSStudent data = studentData[front];
        
        size = size - 2;
        krsSize = krsSize + 2;
        krsRemain = krsRemain - 2;

        if (size == 0)
            front = rear = -1;   
        else
            front = (front + 2) % max;

        return data;
    }

    void showAll()
    {
        if (isEmpty()) 
        {
            System.out.println("Queue is Empty!!!");
            return;
        }

        int i = front;
            while (i != rear) 
            {
                studentData[i].print();
                i = (i + 1) % max;    
            }
        studentData[i].print();
    }

    void peek()
    {
        if (isEmpty()) 
        {
            System.out.println("Queue is empty!!!");
            return;
        }
        else if (size == 1) 
        {
            studentData[front].print();
            System.out.println("There is only one student in the queue");
            return;
        }

        int secondIndex = (front + 1) % max;
        studentData[front].print();
        studentData[secondIndex].print();
    }

    void viewRear() 
    {
        if (!isEmpty()) 
            studentData[rear].print(); 
        else
            System.out.println("Queue is empty!!!");
    }

    void check()
    {
        if (isEmpty())
            System.out.println("Queue is empty!!!");
        else if (isFull())
            System.out.println("Queue is full!!!");
        else
            System.out.printf("There's %d students in Queue\n", size);
    }
    
    void clear()
    {
        if (!isEmpty()) 
        {
            front = rear = -1;
            size = 0;
            System.out.println("All data has been successfully removed!");    
        }
        else
            System.out.println("Queue is already empty!!!");
    }
}
