package com.prj1;

public class Person {
    public String name;
    public int age;
    public boolean AgeIsBetween(int range_start, int range_end){
        if ((this.age>=range_start)&&(this.age<range_end)) return true;
        else return false;
    }
    public Person(String _name, int _age){
        this.name = _name;
        this.age = _age;
    }
    
}
