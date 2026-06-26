package com.finalExam;

public class NodeTax 
{
    Tax dataTax;
    NodeTax prev, next;

    public NodeTax() {}
    public NodeTax (Tax dataTax) 
    {
        this.dataTax    = dataTax;
        prev            = null;
        next            = null;
    }

    public NodeTax (NodeTax prev, Tax dataTax, NodeTax next) 
    {
        this.dataTax    = dataTax;
        this.prev       = prev;
        this.next       = next;
    }
}
