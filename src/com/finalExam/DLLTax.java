package com.finalExam;

public class DLLTax 
{
    NodeTax head, tail;

    public DLLTax() 
    {
        head    = null;
        tail    = null;
    }

    boolean isEmpty()
    {
        return head == null;
    }

    void addTaxTransaction (Tax data)
    {
        NodeTax newNode = new NodeTax (data);

        if (isEmpty())
        {
            data.code = 1;
            head = tail = newNode;
        }
        else
        {
            data.code = tail.dataTax.code + 1;
            tail.next       = newNode;
            newNode.prev    = tail;
            tail            = newNode;
        }
    }

    void displayAll()
    {
        if (isEmpty()) 
            System.out.println("Tax Transaction is empty!!");
        else
        {
            InsertionSortAscending();

            System.out.printf
            (
            "%-6s | %-10s | %-12s | %-8s | %-5s | %-7s | %-7s | %-11s | %-9s | %-11s\n",
            "Code", "TNKB", "Name", "Type", "CC", "Due Mon", "Pay Mon", "Nominal", "Fine", "Total Pay"
            );

            NodeTax temp = head;
            int totalTransaction = 0;
            
            while (temp != null)
            {
                temp.dataTax.print();
                totalTransaction += (temp.dataTax.nominal + temp.dataTax.fine);
                temp = temp.next;
            }
            System.out.println("Total Transaction: Rp " + totalTransaction);
        }      
    }

    void InsertionSortAscending()
    {
        NodeTax current = head.next;
        
        while (current != null) 
        {
            Tax letter = current.dataTax;
            String letterName = letter.dataVehicle.name;
            
            NodeTax j = current.prev;

            while (j != null && j.dataTax.dataVehicle.name.compareToIgnoreCase(letterName) > 0) 
            {
                j.next.dataTax = j.dataTax;
                j = j.prev;
            }

            if (j == null)
                head.dataTax = letter;
            else
                j.next.dataTax = letter;

            current = current.next;
        }
    }
}
