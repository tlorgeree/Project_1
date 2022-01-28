package com.prj1;

import java.awt.*;

public class Patient extends Person{
    public String doctor;

    public Patient(String _name, int _age, String _doctor){
        super.name =_name;
        super.age = _age;
        this.doctor = _doctor;
    }

    public String toString(){
        return "Patient name: " + name +
                "\nPatient age: " + age +
                "\nPatient's Doctor: " + doctor;
    }
}
