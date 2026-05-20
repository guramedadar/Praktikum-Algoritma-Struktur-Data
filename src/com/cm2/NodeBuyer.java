package com.cm2;

public class NodeBuyer 
{
    Buyer       data;
    NodeBuyer   next, 
                prev;

    NodeBuyer (Buyer b) 
    {
        data = b;
        next = null;
        prev = null;
    }
}
