package com.jobsheet12;

public class SingleLinkedList08 
{
    Node08 head, tail;

    boolean isEmpty()
    {
        return head == null;
    }

    void print()
    {
        if (!isEmpty())
        {
            Node08 tmp = head;
            System.out.println("LinkedList Data:");

            while (tmp != null)
            {
                tmp.data.print();
                tmp = tmp.next;
            }
        }
        else
            System.out.println("LinkedList is empty!!");
    }
    
    void addFirst (Student08 std)
    {
        Node08 newNode = new Node08(std, null);
        
        if (isEmpty()) 
        {
            head = newNode;
            tail = newNode;    
        }
        else
        {
            newNode.next = head;
            head = newNode;
        }
    }

    void addLast (Student08 std)
    {
        Node08 newNode = new Node08(std, null);

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
    }

    void insertAfter (Student08 std, String key)
    {
        Node08 newNode = new Node08(std, null);
        Node08 temp = head;
        
        do 
        { 
            if (temp.data.name.equalsIgnoreCase((key))) 
            {
                newNode.next = temp.next;
                temp.next = newNode;
                
                if (newNode.next == null)
                    tail = newNode;

                break;
            }

            temp = temp.next;

        }   while (temp != null);
    }

    public void inserAt (int index, Student08 std)
    {
        if (index < 0)
            System.out.println("Wrong Index!!");
        else if (index == 0)
            addFirst(std);
        else
        {
            Node08 temp = head;

            for (int i = 0; i < index; i++) 
                temp = temp.next;

            temp.next = new Node08(std, temp.next);

            if (temp.next.next == null)
                tail = temp.next;
        }
    }
}
