package com.finalExam;

public class NodeVehicle 
{
    Vehicle dataVehicle;
    NodeVehicle prev, next;

    public NodeVehicle() {}
    public NodeVehicle (Vehicle dataVehicle) 
    {
        this.dataVehicle    = dataVehicle;
        prev                = null;
        next                = null;
    }

    public NodeVehicle(NodeVehicle prev, Vehicle dataVehicle, NodeVehicle next) 
    {
        this.dataVehicle    = dataVehicle;
        this.prev           = prev;
        this.next           = next;
    }    
}
