package com.finalExam;

public class DLLVehicle 
{
    NodeVehicle head, tail;

    public DLLVehicle() 
    {
        head    = null;
        tail    = null;
    }

    boolean isEmpty()
    {
        return head == null;
    }
    
    void addVehicleData (Vehicle data)
    {
        NodeVehicle newNode = new NodeVehicle (data);

        if (isEmpty())
            head = tail = newNode;
        else
        {
            tail.next       = newNode;
            newNode.prev    = tail;
            tail            = newNode;
        }
    }

    Vehicle searchVehicleTNKB (String tnkb) 
    {
        NodeVehicle temp = head;

        while (temp != null) 
        {
            if (temp.dataVehicle.tnkb.equalsIgnoreCase(tnkb))
                return temp.dataVehicle;

            temp = temp.next;
        }
        
        return null;
    }
}
