package com.comparator;

import java.util.*;
import java.util.stream.Collectors;

class Employee   {
    private String name;
    private double salary;
    private  String technology;
    private int age;

    public Employee(String name, double salary, String technology, int age) {
        this.name = name;
        this.salary = salary;
        this.technology = technology;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String gettechnology() {
        return technology;
    }

    public void settechnology(String technology) {
        this.technology = technology;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Name :"+name+" , Salary :"+salary+" , Technology :"+technology+" , Age :"+age+"\n";
    }

}
public class FilterEmployeeData {

    public static void main(String[] args) {

//        Create a List reference of type Employee in which we add the Employee details
        List<Employee> employees = new ArrayList<Employee>();
        employees.add(new Employee("Vishal",18000.00,"Java",23));
        employees.add(new Employee("Sumit",15000.00,"FrontEnd",23));
        employees.add(new Employee("Anupam",25000.00,"Java",23));
        employees.add(new Employee("Himanshu",13500.00,"Database",23));
        employees.add(new Employee("Suraj",20000.00,"Pyhton",23));
        employees.add(new Employee("Rohit",21000.00,"Database",23));
        employees.add(new Employee("Rahul",13000.00,"Java",23));
        employees.add(new Employee("Aayush",16000.00,"Pyhton",23));
        employees.add(new Employee("Arun",23000.00,"Database",23));
        employees.add(new Employee("Dipanshu",21000.00,"FrontEnd",23));

        System.out.println("*** Employee Details without any filter ***");
        for (Employee e :employees){
            System.out.println(e);
        }
        System.out.println("***** Java Developer Employee Details *****");
        List<Employee> javaEmployee = employees.stream().filter(employee -> employee.gettechnology().equalsIgnoreCase("Java")).collect(Collectors.toList());
        for (Employee e :javaEmployee){
            System.out.println(e);
        }
        long noOfEmployee = javaEmployee.stream().count();
        System.out.println("Total Number of Employee In java Developer :"+noOfEmployee);


        System.out.println("***********************");
        System.out.println("Show the employee details which salary is grater then 15000");
        employees.stream().filter(employee -> employee.getSalary() > 15000).forEach(System.out::println);


//        Sorting employee data with their name in ascending order and using Comparable interface

        System.out.println("------- Sorting Employee Details based on Default Sorting  --------");
//        employees.stream().sorted((e1,e2)->e1.getName().compareTo(e2.getName())).forEach(System.out::println);

//       In this we directly sort the employee with the help of comparing() method which is static and present in Comparator Interface

//        employees.stream().sorted(Comparator.comparing(Employee::getName)).forEach(System.out::println);

        System.out.println("Sorting employee details with respect to salary :");
        employees.stream().sorted(Comparator.comparingDouble(Employee::getSalary).reversed()).forEach(System.out::println);

        System.out.println("Sum of the Employees Salary :");
        Double salarySum = employees.stream().collect(Collectors.summingDouble(Employee::getSalary));
        System.out.println("Total Salary :"+salarySum);

        System.out.println("Sum of all salary which is work on JAVA technology");
        double javaSalary = javaEmployee.stream().collect(Collectors.summingDouble(Employee::getSalary));
        System.out.println("Total Salary of Java Developer :"+javaSalary);

        System.out.println("Maximum and minimum salary wise data  :");
        Optional<Employee> max = employees.stream().collect(Collectors.maxBy(Comparator.comparingDouble(Employee::getSalary)));
        System.out.println("Employee details swith max salary : \n"+max.get());
        Optional<Employee> min = employees.stream().collect(Collectors.minBy(Comparator.comparingDouble(Employee::getSalary)));
        System.out.println("Employee details swith min salary : \n "+min.get());


        System.out.println("Grouping of Employee data with the technology");
        System.out.println(employees.stream().collect(Collectors.groupingBy(Employee::gettechnology,Collectors.counting())));


        System.out.println(employees.stream().collect(Collectors.groupingBy(Employee::gettechnology)));


        Map<String,String> map = employees.stream().filter(e->e.getSalary() > 20000).collect(Collectors.toMap(Employee::getName,Employee::gettechnology));
        System.out.println("Employee with name and technology");
        System.out.println(map);
    }
}
