package com.company;

public class Car {

    private int tyre;
    private int engine;
    private int door;
    private int seat;
    private int steeringWheel;

    public Car(int tyre, int engine, int door, int seat,int steeringWheel )
    {
        super();
        this.tyre = tyre;
        this.engine = engine;
        this.door =door;
        this.seat = seat;
        this.steeringWheel = steeringWheel;
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "Car{" +
                "tyre=" + tyre +
                ", engine=" + engine +
                ", door=" + door +
                ", seat=" + seat +
                ", steeringWheel=" + steeringWheel +
                '}';
    }
}
