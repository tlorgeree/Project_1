package com.prj1;

public class Doctor extends Person{
    public String specialty;

    public Doctor(String _name, int _age, String _specialty){
        super(_name,_age);
        this.specialty = _specialty;
    }

    public String toString(){
        return "Doctor's name: " + name +
                "\nDoctor's age: " + age +
                "\nDoctor's Specialty: " + specialty;
    }
}
