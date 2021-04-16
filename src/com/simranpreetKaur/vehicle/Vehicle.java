package com.simranpreetKaur.vehicle;

import com.simranpreetKaur.IDisplay;

public abstract class Vehicle implements IDisplay {

    int VIN;
    String brand;
    Boolean isInsured;

    public Vehicle(int VIN, String brand, Boolean isInsured) {
        this.VIN = VIN;
        this.brand = brand;
        this.isInsured = isInsured;
    }

    public int getVIN() {
        return VIN;
    }

    public void setVIN(int VIN) {
        this.VIN = VIN;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public Boolean getInsured() {
        return isInsured;
    }

    public void setInsured(Boolean insured) {
        isInsured = insured;
    }

    public  abstract String getType();


}
