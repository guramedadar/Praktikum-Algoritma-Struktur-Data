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

    public void add(Student8 newData) 
    {
        if (idxLast == -1) 
        {
            data[0] = newData;
            idxLast = 0;
            return;
        }
        
        int currentIdx = 0;
        
        while (true) 
        {
            if (newData.ipk < data[currentIdx].ipk) 
            {
                int leftChildIdx = 2 * currentIdx + 1;

                if (leftChildIdx >= data.length) 
                {
                    System.out.println("Array capacity exceeded!");
                    break;
                }

                if (data[leftChildIdx] == null) 
                {
                    data[leftChildIdx] = newData;
                    if (leftChildIdx > idxLast) idxLast = leftChildIdx;
                    break;
                } 
                else
                    currentIdx = leftChildIdx;
            } 
            else if (newData.ipk > data[currentIdx].ipk) 
            {
                int rightChildIdx = 2 * currentIdx + 2;

                if (rightChildIdx >= data.length) 
                {
                    System.out.println("Array capacity exceeded!");
                    break;
                }

                if (data[rightChildIdx] == null) 
                {
                    data[rightChildIdx] = newData;

                    if (rightChildIdx > idxLast) 
                        idxLast = rightChildIdx;

                    break;
                } 
                else 
                    currentIdx = rightChildIdx;
            } 
            else 
            {
                System.out.println("Student with the same IPK already exists.");
                break;
            }
        }
    }
    
    public void traversePreOrder(int idxStart) 
    {
        if (idxStart <= idxLast) 
        {
            if (data[idxStart] != null) 
            {
                data[idxStart].print();
                traversePreOrder(2 * idxStart + 1);
                traversePreOrder(2 * idxStart + 2);
            }
        }
    }
}
