package com.company;

public class Main
{
    public static void main(String args[])
    {
        Vehicle c = new VehicleBuilder().setTyre(4).setDoor(4).setEngine(1).setSteeringWheel(1).setSeat(4).getVehicle();
        System.out.println(c);
    }
}
