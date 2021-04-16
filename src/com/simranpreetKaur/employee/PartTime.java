package com.simranpreetKaur.employee;

import com.simranpreetKaur.Gender;
import com.simranpreetKaur.customException.InValidNameException;
import com.simranpreetKaur.customException.InValidSalaryException;
import com.simranpreetKaur.utils.Utils;
import com.simranpreetKaur.vehicle.Vehicle;

public class PartTime extends com.simranpreetKaur.employee.Faculty {
    int noHoursWorked;
    double payPerHour;

    public PartTime(int id, String firstname, String lastname, Gender gender, Vehicle vehicle, double baseSalary, String department, int noHoursWorked, double payPerHour) throws InValidSalaryException, InValidNameException {
        super(id, firstname, lastname, gender, vehicle, baseSalary, department);

        this.noHoursWorked = noHoursWorked;
        this.payPerHour = payPerHour;
    }

    public int getNoHoursWorked() {
        return noHoursWorked;
    }

    public void setNoHoursWorked(int noHoursWorked) {
        this.noHoursWorked = noHoursWorked;
    }

    public double getPayPerHour() {
        return payPerHour;
    }

    public void setPayPerHour(double payPerHour) {
        this.payPerHour = payPerHour;
    }

    @Override
    public String getType() {
        return "Part Time Employee";
    }

    @Override
    public String display() {
        System.out.println("Employee Id :" + this.getId());
        System.out.println("Employee First Name :" + this.getFirstname());
        System.out.println("Employee Last Name :" + this.getLastname());
        System.out.println("Employee Gender :" + this.getGender());
        System.out.println("Employee Department :" + this.getDepartment());
        System.out.println("Employee Hours Worked :" + this.getNoHoursWorked());
        System.out.println("Employee Pay/Hr :" + Utils.currencyFormater(this.getPayPerHour()));
        System.out.println("Employee Total Salary :"+ Utils.currencyFormater(this.calculateTotalSalary()));



        if (this.getVehicle() == null) {
            System.out.println("Employee do not have vehicle");
        } else {
            this.getVehicle().display();
        }
        return null;
    }

    @Override
    public double calculateTotalSalary() {
        return noHoursWorked * payPerHour;
    }
}
