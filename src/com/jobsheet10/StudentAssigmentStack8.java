package com.jobsheet10;

public class StudentAssigmentStack8 
{
    Student8[] stack;
    int top, 
        size;

    public StudentAssigmentStack8 (int size) 
    {
        this.size = size;
        top = -1;
        stack = new Student8[size];
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

    void push (Student8 std)
    {
        if (!isFull()) 
        {
            top++;
            stack[top] = std;    
        }
        else
            System.out.println("Stack is already full!!");
    }

    Student8 pop ()
    {
        if (!isEmpty()) 
        {
            Student8 std = stack[top];
            top--;
            return std;    
        }
        else
        {
            System.out.println("There's no data in Stack!!");
            return null;
        }
    }

    Student8 peek ()
    {
        if (!isEmpty()) 
            return stack[top];
        else
        {
            System.out.println("There's no data in Stack!!");
            return null;
        }
    }

    void print()
    {
        for (int i = 0; i <= top; i++) 
        {
            System.out.println
            (
                stack[i].nim + "\t" +
                stack[i].name + "\t" +
                stack[i].className
            );    
        }
        System.out.println("");
    }

    Student8 firstSubmission() 
    {
        if (!isEmpty())
            return stack[0];
        else
            return null;
    }

    int count() 
    {
        return top + 1;
    }

    String convertToBinary (int grade)
    {
        ConversionStack stack = new ConversionStack();
        while (grade > 0) 
        {
            int mod = grade % 2;
            stack.push(mod);
            grade = grade / 2;    
        }

        String binary = "";
        while (!stack.isEmpty()) 
            binary += stack.pop();
        
        return binary;
    }
}
