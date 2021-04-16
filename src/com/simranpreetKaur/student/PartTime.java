package com.simranpreetKaur.student;

import com.simranpreetKaur.Gender;
import com.simranpreetKaur.customException.InValidNameException;
import com.simranpreetKaur.vehicle.Vehicle;

public  class PartTime extends Student{

    int attendance;

    public PartTime(int id, String firstname, String lastname, Gender gender, Vehicle vehicle, String collegeName, String courseName, String result, int attendance) throws InValidNameException {
        super(id, firstname, lastname, gender, vehicle, collegeName, courseName, result);

        this.attendance = attendance;
    }

    public int getAttendance() {
        return attendance;
    }

    public void setAttendance(int attendance) {
        this.attendance = attendance;
    }

    @Override
    public String getType() {
        return "Part Time Student";
    }

    @Override
    public String display() {
        System.out.println("Student Id :" + this.getId());
        System.out.println("Student First Name :" + this.getFirstname());
        System.out.println("Student Last Name :" + this.getLastname());
        System.out.println("Student Gender :" + this.getGender());

        System.out.println("Student College Name :" + this.getCollegeName());
        System.out.println("Student Course Name :" + this.getCourseName());
        System.out.println("Student Result :" + this.getResult());

        System.out.println("Attendance :" + this.attendance);
//        System.out.println("Employee Total Salary :"+ this.getId() );

        if (this.getVehicle() == null) {
            System.out.println("Employee do not have vehicle");
        } else {
            this.getVehicle().display();
        }
        return null;
    }
}
