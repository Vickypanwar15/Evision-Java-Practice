package com.abstractp;

public class Student extends Person{

    private int studentNo;
    private String clgName;
    private double fees;

    public Student(String name, String age, String address, int studentNo, String clgName, double fees) {
        super(name, age, address);
        this.studentNo = studentNo;
        this.clgName = clgName;
        this.fees = fees;
    }
}
