package com.simranpreetKaur.student;

import com.simranpreetKaur.Gender;
import com.simranpreetKaur.Person;
import com.simranpreetKaur.customException.InValidNameException;
import com.simranpreetKaur.vehicle.Vehicle;

public abstract class Student extends Person{
    String collegeName;
    String courseName;
    String result;

    public Student(int id, String firstname, String lastname, Gender gender, Vehicle vehicle, String collegeName, String courseName, String result) throws InValidNameException {
        super(id, firstname, lastname, gender, vehicle);
        this.collegeName = collegeName;
        this.courseName = courseName;
        this.result = result;
    }

    public String getCollegeName() {
        return collegeName;
    }

    public void setCollegeName(String collegeName) {
        this.collegeName = collegeName;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }
}
