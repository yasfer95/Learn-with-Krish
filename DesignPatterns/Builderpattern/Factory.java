package com.company;

public class Factory
{
    public static void main(String args[])
    {
        Car c = new CarBuilder().setTyre(4).setDoor(4).setEngine(1).setSteeringWheel(1).setSeat(4).getCar();
        System.out.println(c);
    }
}
