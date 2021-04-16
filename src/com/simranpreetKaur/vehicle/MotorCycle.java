package com.simranpreetKaur.vehicle;

public class MotorCycle extends Vehicle {
    int noOfSeats;

    public MotorCycle(int VIN, String brand, Boolean isInsured, int noOfSeats) {
        super(VIN, brand, isInsured);
        this.noOfSeats = noOfSeats;
    }

    public int getNoOfSeats() {
        return noOfSeats;
    }

    public void setNoOfSeats(int noOfSeats) {
        this.noOfSeats = noOfSeats;
    }

    @Override
    public String display() {
        return MotorCycle.class.getName();
    }

    @Override
    public String getType() {
        return null;
    }
}
