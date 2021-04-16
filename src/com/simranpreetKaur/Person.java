package com.simranpreetKaur;

import com.simranpreetKaur.customException.InValidNameException;
import com.simranpreetKaur.vehicle.Vehicle;

public abstract class Person implements com.simranpreetKaur.IDisplay {


    int id;
    String firstname;
    String lastname;
    com.simranpreetKaur.Gender gender;
    Vehicle vehicle;

    public Person(int id, String firstname, String lastname, com.simranpreetKaur.Gender gender, Vehicle vehicle) throws InValidNameException {
        this.id = id;

        if(InValidNameException.validateFirstName(firstname)){
            this.firstname = firstname;
        }else{
            throw new InValidNameException("First Name Length must be grater than 5");
        }

        this.lastname = lastname;
        this.gender = gender;
        this.vehicle = vehicle;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) throws InValidNameException {
       if(InValidNameException.validateFirstName(firstname)){
            this.firstname = firstname;
        }else{
            throw new InValidNameException("Invalid First Name:" + firstname);
       }
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public com.simranpreetKaur.Gender getGender() {
        return gender;
    }

    public void setGender(com.simranpreetKaur.Gender gender) {
        this.gender = gender;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }


    public abstract String getType();
}
