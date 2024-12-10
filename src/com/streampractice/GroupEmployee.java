package com.streampractice;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

class Employee{
    private String name;
    private String city;
    private int age;

    public Employee(String name,String city,int age){
        this.name = name;
        this.city = city;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getCity() {
        return city;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", city='" + city + '\'' +
                ", age=" + age +
                '}'+"\n";
    }
}
public class GroupEmployee {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Dipak sharma", "Delhi", 21));
        employees.add(new Employee("Sumit shirivas", "Delhi", 21));
        employees.add(new Employee("Karan porwal", "Delhi", 23));
        employees.add(new Employee("Mona tailor", "Udaipur", 23));
        employees.add(new Employee("Suresh panwar","Indore",48));
        employees.add(new Employee("Rajesh solanki", "Banglore", 23));
        employees.add(new Employee("Niraj chouhan", "Banglore", 31));
        employees.add(new Employee("Aakash parmar","Mumbai",28));
        employees.add(new Employee("Suresh panwar","Indore",48));
        employees.add(new Employee("Suraj vishwakarma","Indore",24));
        employees.add(new Employee("Sumit shirivas", "Delhi", 21));


        System.out.println(employees);
        System.out.println("Group Employee by Age ");
        Map<Integer,List<Employee>> groupAge = new HashMap<>();
        groupAge = employees.stream().collect(Collectors.groupingBy(Employee::getAge));
        System.out.println(groupAge);

        System.out.println("--------------------------------");
        System.out.println("GROUP BY EMPLOYEE NAME");
        Map<String,List<Employee>> groupName = new HashMap<>();
        groupName = employees.stream().collect(Collectors.groupingBy(Employee::getName));
        System.out.println(groupName);

        System.out.println("--------------------------------");
        System.out.println("GROUP BY EMPLOYEE CITY");
        Map<String,List<Employee>> groupCity = new HashMap<>();
        groupCity = employees.stream().collect(Collectors.groupingBy(Employee::getCity));
        System.out.println(groupCity);
        Set<Employee> s = new HashSet<>();
        Map<String,List<Employee>> d11 = employees.stream().collect(Collectors.groupingBy(Employee::getName));
        System.out.println(d11);
        Set<Employee> set = new HashSet<>();
        employees.stream().collect(Collectors.groupingBy(Employee::getName));

        System.out.println("--------------------------------------------------");
        List<Employee> nameStartwithA = employees.stream().filter(employee -> employee.getName().startsWith("S")).toList();
        System.out.println(nameStartwithA);

//        groupName.remove();
    }
}
