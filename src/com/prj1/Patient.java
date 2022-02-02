package com.prj1;

import java.awt.*;

public class Patient extends Person{
    public String doctor;

    public Patient(String _name, int _age, String _doctor){
        super(_name,_age);
        this.doctor = _doctor;
    }


    public String toString(){
        return "Patient's name: " + name +
                "\nPatient's age: " + age +
                "\nPatient's Doctor: " + doctor;
    }
}
