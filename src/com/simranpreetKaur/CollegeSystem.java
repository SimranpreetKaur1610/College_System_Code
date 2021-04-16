package com.simranpreetKaur;

import com.simranpreetKaur.customException.InValidNameException;
import com.simranpreetKaur.customException.InValidSalaryException;
import com.simranpreetKaur.employee.Employee;
import com.simranpreetKaur.employee.FullTime;
import com.simranpreetKaur.employee.PartTime;
import com.simranpreetKaur.student.Student;
import com.simranpreetKaur.vehicle.Car;
import com.simranpreetKaur.vehicle.Color;

import java.util.ArrayList;


public class CollegeSystem {
    public static void main(String[] args) {

        ArrayList<Person> person  = new ArrayList<Person>();
        try{
            FullTime fullTimeEmloyee = new FullTime(1 , "supriya mehel", "niya", Gender.FEMALE , null , 1000, "HR" , 20);
            person.add(fullTimeEmloyee);
        }catch (InValidSalaryException | InValidNameException e){
             System.out.println(e);
        }

        try{
            FullTime fullTimeEmloyee = new FullTime(5 , "sup", "niya", Gender.MALE , null , 2500, "Assistant manager" , 20);
            person.add(fullTimeEmloyee);
        }catch (InValidSalaryException | InValidNameException e){
            System.out.println(e);
        }


        try{
            Car c1 = new Car(123 , "TOYOTA" , true , Color.BLACK);
            PartTime partTimeEmployee = new PartTime( 2 , "Kiranpreet " , "Sharma" , Gender.MALE , c1 , 5000 , "Account" ,20 , 15);
            person.add(partTimeEmployee);
        }catch (InValidSalaryException | InValidNameException e){
            System.out.println(e);

        }

        try {
            com.simranpreetKaur.student.FullTime fullTimeStudent = new com.simranpreetKaur.student.FullTime(1, "Simranpreet", "Kaur", Gender.FEMALE, null, "Lambton College", "CSAT", "A", 20);
            person.add(fullTimeStudent);
        }catch (InValidNameException e){
            System.out.println(e);
        }

        try{
            Car c2 = new Car(198 , "MARTIN" , true , Color.PINK);
            com.simranpreetKaur.student.PartTime partTimeStudent = new com.simranpreetKaur.student.PartTime(1 , "Raman", "Singh", Gender.MALE , c2, "Lambton College" ,"CPCT" , "A" ,9);
            person.add(partTimeStudent);
        }catch (InValidNameException e){
            System.out.println(e);
        }



        for (Person p : person)
        {
            if(p instanceof Employee){
                System.out.println();
                System.out.println("*********Employee*********");
                if (p instanceof FullTime) {
                    System.out.println("----------Full Time Employee----------");
                }
                if (p instanceof PartTime) {
                    System.out.println();
                    System.out.println("----------Part Time Employee----------");
                }
            }

            if(p instanceof Student) {
                System.out.println();
                System.out.println("*********Student*********");
                if (p instanceof com.simranpreetKaur.student.FullTime) {
                    System.out.println();
                    System.out.println("----------Full Time Student----------");
                }
                if (p instanceof com.simranpreetKaur.student.PartTime) {
                    System.out.println();
                    System.out.println("----------Part Time Student----------");
                }
            }
            p.display();
        }

    }
}
