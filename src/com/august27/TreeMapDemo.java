package com.august27;

import java.util.Comparator;
import java.util.TreeMap;

class Employee{
    String name;
    int age;
    Employee(String name,int age){
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return name+" : "+age;
    }
}

public class TreeMapDemo {
    public static void main(String[] args) {
        Employee e1 = new Employee("Vishal",23);
        Employee e2 = new Employee("Dipanshu",24);
        Employee e3 = new Employee("Yash",19);
        Employee e4 = new Employee("Amit",21);

        TreeMap t1 = new TreeMap(new MyComaprator());
        t1.put(e1,100);
        t1.put(e3,200);
        t1.put(e4,132);
        t1.put(e2,321);
        System.out.println(t1);
    }
}
class MyComaprator implements Comparator<Employee>{
    @Override
    public int compare(Employee e1,Employee e2) {
//        sorting with respect to employee age in ascending order
//        return Integer.compare(e1.age,e2.age);

//        sorting with respect to employee age in ascending order
//        return  -Integer.compare(e1.age,e2.age);

//        Sorting with respect to employee name in ascending order
//        return  e1.name.compareTo(e2.name);
//        Sorting with respect to employee name in descending order
        return  -e1.name.compareTo(e2.name);
    }
}
