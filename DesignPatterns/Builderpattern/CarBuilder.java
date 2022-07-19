package com.company;


    public class CarBuilder
    {
        private int tyre;
        private int engine;
        private int door;
        private int seat;
        private int steeringWheel;

        public CarBuilder setTyre(int tyre) {
            this.tyre = tyre;
            return this;
        }

        public CarBuilder setEngine(int engine) {
            this.engine = engine;
            return this;
        }

        public CarBuilder setDoor(int door) {
            this.door = door;
            return this;
        }

        public CarBuilder setSeat(int seat) {
            this.seat = seat;
            return this;
        }

        public CarBuilder setSteeringWheel(int steeringWheel) {
            this.steeringWheel = steeringWheel;
            return this;
        }
        public Car getCar()
        {
            return new Car(tyre, engine, door, seat, steeringWheel);
        }
    }

