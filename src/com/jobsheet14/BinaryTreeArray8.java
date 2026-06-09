package com.jobsheet14;

public class BinaryTreeArray8 
{
    Student8[] data;
    int idxLast;

    public BinaryTreeArray8() 
    {
        data = new Student8[10];
        idxLast = -1;
    }

    void populateData (Student8[] data, int idxLast)
    {
        this.data = data;
        this.idxLast = idxLast;
    }

    void traverseInOrder (int idxStart)
    {
        if (idxStart <= idxLast)
        {
            if (data[idxStart] != null)
            {
                traverseInOrder(2 * idxStart + 1);
                data[idxStart].print();
                traverseInOrder(2 * idxStart + 2);
            }
        }
    }
    
}
