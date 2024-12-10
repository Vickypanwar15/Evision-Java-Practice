package com.sept9.pratice;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class EmployeeDataFilter implements Comparable {
    String name;
    int age;
    EmployeeDataFilter(String name,int age){
        this.name=name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Name : "+name+" , Age :"+age+"\n";
    }

//    sorting with respect to age
//    @Override
//    public int compareTo(Object o) {
//        EmployeeDataFilter d = (EmployeeDataFilter) o;
//        int age = d.getAge();
//        return compareTo(age);
//    }


    @Override
    public int compareTo(Object o) {
        EmployeeDataFilter e = (EmployeeDataFilter) o;
        String name = e.name;
        return e.compareTo(name);
    }

    public static void main(String[] args) {
        List<EmployeeDataFilter> list = new ArrayList<>();
        list.add(new EmployeeDataFilter("Vishal",23));
        list.add(new EmployeeDataFilter("Suresh",50));
        list.add(new EmployeeDataFilter("Ashok",48));
        list.add(new EmployeeDataFilter("Rahul",24));
        list.add(new EmployeeDataFilter("Siddharth",12));
        list.add(new EmployeeDataFilter("Raghav",15));
        list.add(new EmployeeDataFilter("Ravina",30));
        list.add(new EmployeeDataFilter("Vishal",23));
        list.add(new EmployeeDataFilter("Suresh",48));

        System.out.println("Without filter the data are;");
        System.out.println(list);
        System.out.println("Employee data where age is > 22 and < 31 ");
       list.stream().filter(e->e.getAge() > 22 && e.getAge() <31).forEach(System.out::println);

        System.out.println("Data where age is <20");
        list.stream().filter(e->e.getAge()<20).forEach(System.out::println);

//        System.out.println("Sorted order of emploee data with age");
//        list.stream().sorted((e,e1)-> e.getAge().compareTo(e1.getAge())).forEach(System.out::println);

        System.out.println("Sorted order of data with respect to name");

        list.stream().sorted((e,e1)->e.getName().compareTo(e1.getName())).forEach(System.out::println);

    }
}
