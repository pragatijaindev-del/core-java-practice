package com.example;
//Group employees by department using groupingBy()
public class Empolyee {
    String name;
    String department;

    Empolyee(String name, String department) {
        this.name = name;
        this.department = department;
    }

    @Override
    public String toString() {
        return name;
    }
}