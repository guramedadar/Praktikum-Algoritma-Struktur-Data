package com.cm2;

public class OrderList 
{
    NodeOrder   head, 
                tail;

    boolean isEmpty() 
    {
        return head == null;
    }

    void addOrder (Order o) 
    {
        NodeOrder newNode = new NodeOrder(o);
        
        if (isEmpty())
            head = tail = newNode;
        else 
        {
            tail.next       = newNode;
            newNode.prev    = tail;
            tail            = newNode;
        }
    }

    void insertionSortOrders() 
    {
        if (isEmpty()) 
            return;

        NodeOrder i = head.next;

        while (i != null) 
        {
            Order       key = i.data;
            NodeOrder   j   = i.prev;

            while (j != null && j.data.orderName.charAt(0) > key.orderName.charAt(0)) 
            {
                j.next.data = j.data;
                j           = j.prev;
            }

            if (j == null)
                head.data = key;
            else
                j.next.data = key;

            i = i.next;
        }
    }

    void printOrders() 
    {    
        if (isEmpty()) 
        {
            System.out.println("No orders yet!");
            return;
        }
        
        insertionSortOrders();
        
        System.out.println("ORDER REPORT (SORTED BY ORDER NAME)");

        NodeOrder tmp = head;

        while (tmp != null) 
        {
            System.out.println(tmp.data.orderCode + " | " + tmp.data.orderName + " | " + tmp.data.price);
            tmp = tmp.next;
        }
    }

    int totalPrice()
    {
        int         total   = 0;
        NodeOrder   tmp     = head;

        while (tmp != null) 
        {
            total   += tmp.data.price;
            tmp     = tmp.next;
        }

        return total;
    }
}



    // void insertionSortOrdersByCode() 
    // {
    //     NodeOrder i = head.next;

    //     while (i != null) 
    //     {
    //         Order       key = i.data;
    //         NodeOrder   j   = i.prev;

    //         while (j != null && j.data.orderCode > key.orderCode) 
    //         {
    //             j.next.data = j.data;
    //             j           = j.prev;
    //         }

    //         if (j == null)
    //             head.data = key;
    //         else
    //             j.next.data = key;

    //         i = i.next;
    //     }
    // }