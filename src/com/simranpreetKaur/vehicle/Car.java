package com.simranpreetKaur.vehicle;

public class Car extends com.simranpreetKaur.vehicle.Vehicle {
    com.simranpreetKaur.vehicle.Color color;


    public Car(int VIN, String brand, Boolean isInsured, com.simranpreetKaur.vehicle.Color color) {
        super(VIN, brand, isInsured);
        this.color = color;
    }

    public com.simranpreetKaur.vehicle.Color getColor() {
        return color;
    }

    public void setColor(com.simranpreetKaur.vehicle.Color color) {
        this.color = color;
    }

    @Override
    public String getType() {
        return Car.class.getName();
    }

    @Override
    public String display() {
        System.out.println("Car VIN No :"+ this.getVIN() );
        System.out.println("Car Brand :"+ this.getBrand() );
        System.out.println("Is Insured :"+ this.getInsured() );

        System.out.println("Car Color:"+ this.getColor());
        return null;
    }

}
