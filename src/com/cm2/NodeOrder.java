package com.cm2;

public class NodeOrder 
{
    Order       data;
    NodeOrder   next, 
                prev;

    NodeOrder (Order o) 
    {
        data = o;
        next = null;
        prev = null;
    }
}
