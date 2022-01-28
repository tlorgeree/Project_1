package com.prj1;

public class Doctor extends Person{
    public String specialty;

    public Doctor(String _name, int _age, String _specialty){
        super(_name,_age);
        this.specialty = _specialty;
    }

    public String toString(){
        return "Patient name: " + name +
                "\nPatient age: " + age +
                "\nPatient's Doctor: " + specialty;
    }
}
