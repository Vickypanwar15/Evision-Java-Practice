package com.sept23;

import java.util.ArrayList;
import java.util.List;

public class Employee {
    private int empNo;
    private String name;
    private String dept;
    private double salary;

    public Employee(int empNo, String name, String dept,double salary) {
        this.empNo = empNo;
        this.name = name;
        this.dept = dept;
        this.salary = salary;
    }

    public int getEmpNo() {
        return empNo;
    }

    public String getName() {
        return name;
    }

    public String getDept() {
        return dept;
    }

    public  double getSalary(){
        return salary;
    }

    public void setEmpNo(int empNo) {
        this.empNo = empNo;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Emp No:"+empNo+" , "+"Name:"+name+" , "+"Department :"+dept+" , Salary :"+salary+"\n";
    }

    public  static List<Employee> addEmployees(){
        List<Employee> arrList = new ArrayList<>();
        arrList.add(new Employee(201,"Ajit","Testing",50000.00));
        arrList.add(new Employee(301,"Amit","Team",45000));
        arrList.add(new Employee(210,"Suraj","Finance",25500));
        arrList.add(new Employee(321,"Sumit","Backend",34500));
        arrList.add(new Employee(444,"Dipanshu","Testing",15000));
        arrList.add(new Employee(555,"Anupam","Backend",18000));
        arrList.add(new Employee(1001,"Deven","Intern",8000));
        arrList.add(new Employee(2001,"Arun","Intern",10000));
        arrList.add(new Employee(3001,"Manoj","Intern",4000));
        arrList.add(new Employee(4001,"Vishal","Intern",6000));
        return  arrList;
    }
}
