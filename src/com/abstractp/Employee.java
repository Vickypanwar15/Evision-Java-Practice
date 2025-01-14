package com.abstractp;

public class Employee extends Person{

    private int empNo;
    private double salary;
    private String companyName;

    public Employee(String name, String age, String address, int empNo, double salary, String companyName) {
        super(name, age, address);
        this.empNo = empNo;
        this.salary = salary;
        this.companyName = companyName;
    }
}
