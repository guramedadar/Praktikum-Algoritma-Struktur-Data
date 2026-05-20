package com.cm2;

public class Order 
{
    int     orderCode,
            price;
    String  orderName;

    Order (int c, String n, int p) 
    {
        orderCode   = c;
        orderName   = n;
        price       = p;
    }
}
