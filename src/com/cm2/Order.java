package com.cm2;

public class Order 
{
    int     orderCode,
            price,
            amount;
    String  orderName;

    Order (int c, String n, int p, int a) 
    {
        orderCode   = c;
        orderName   = n;
        price       = p;
        amount      = a;
    }
}
