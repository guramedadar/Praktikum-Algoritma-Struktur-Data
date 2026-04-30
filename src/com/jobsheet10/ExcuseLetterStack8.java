package com.jobsheet10;

public class ExcuseLetterStack8 
{
    ExcuseLetter8[] stack;
    int top,
        size;

    public ExcuseLetterStack8(int size) 
    {
        this.size = size;
        top = -1;
        stack = new ExcuseLetter8[size];
    }
    
    boolean isFull ()
    {
        if (top == size - 1)
            return true;
        else
            return false;
    }

    boolean isEmpty ()
    {
        if (top == -1)
            return true;
        else
            return false;
    }

    void push (ExcuseLetter8 ltr)
    {
        if (!isFull()) 
        {
            top++;
            stack[top] = ltr;    
        }
        else
            System.out.println("Stack is already full!!");
    }

    ExcuseLetter8 pop ()
    {
        if (!isEmpty()) 
        {
            ExcuseLetter8 ltr = stack[top];
            top--;
            return ltr;    
        }
        else
        {
            System.out.println("There's no data in Stack!!");
            return null;
        }
    }

    ExcuseLetter8 peek ()
    {
        if (!isEmpty()) 
            return stack[top];
        else
        {
            System.out.println("There's no data in Stack!!");
            return null;
        }
    }

    void Searching (String search)
    {
        boolean key = true;
        for (int i = 0; i < size; i++)
        {
            if (stack[i] != null && stack[i].name.equals(search))
            {
                System.out.printf
                (
                    """
                    The letter has been found!
                    Name        : %s
                    Reason      : %c
                    Duration    : %d  
                    """
                    , stack[i].name, stack[i].typeOfExcuse, stack[i].duration 
                );
                key = false;
                break;
            }
        }

        if (key != false) 
        {
            System.out.println("The letter was not found!");
        }
    }
}
