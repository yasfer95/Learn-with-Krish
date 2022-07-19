package com.company;


    public class VehicleBuilder
    {
        private int tyre;
        private int engine;
        private int door;
        private int seat;
        private int steeringWheel;

        public VehicleBuilder setTyre(int tyre) {
            this.tyre = tyre;
            return this;
        }

        public VehicleBuilder setEngine(int engine) {
            this.engine = engine;
            return this;
        }

        public VehicleBuilder setDoor(int door) {
            this.door = door;
            return this;
        }

        public VehicleBuilder setSeat(int seat) {
            this.seat = seat;
            return this;
        }

        public VehicleBuilder setSteeringWheel(int steeringWheel) {
            this.steeringWheel = steeringWheel;
            return this;
        }
        public Vehicle getVehicle()
        {
            return new Vehicle(tyre, engine, door, seat, steeringWheel);
        }
    }

