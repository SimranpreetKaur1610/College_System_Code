package com.simranpreetKaur.employee;

import com.simranpreetKaur.Gender;
import com.simranpreetKaur.customException.InValidNameException;
import com.simranpreetKaur.customException.InValidSalaryException;
import com.simranpreetKaur.utils.Utils;
import com.simranpreetKaur.vehicle.Vehicle;

public class FullTime extends com.simranpreetKaur.employee.Faculty {
    double bonus;

    public FullTime(int id, String firstname, String lastname, Gender gender, Vehicle vehicle, double baseSalary, String department, double bonus) throws InValidSalaryException, InValidNameException {
        super(id, firstname, lastname, gender, vehicle, baseSalary, department);

        this.bonus = bonus;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }



    @Override
    public String getType() {
        return "Part Time Employee";
    }

    @Override
    public String display() {
        System.out.println("Employee Id :"+ this.getId() );
        System.out.println("Employee First Name :"+ this.getFirstname() );
        System.out.println("Employee Last Name :"+ this.getLastname() );
        System.out.println("Employee Gender :"+ this.getGender() );
        System.out.println("Employee Department :"+ this.getDepartment() );
        System.out.println("Employee Bonus :"+ Utils.currencyFormater(this.getBonus()));
        System.out.println("Employee Total Salary :"+ Utils.currencyFormater(this.calculateTotalSalary()));

        if(this.getVehicle() == null){
            System.out.println("Employee do not have vehicle");
        }else{
            this.getVehicle().display();
        }
        return null;
    }


    @Override
    public double calculateTotalSalary() {
        return this.baseSalary + this.bonus;
    }
}
