package com.august26setmap;

import java.util.Comparator;
import java.util.TreeSet;

class  Employee implements Comparable {
    String name;
    int id;
    public Employee(String name,int id) {
        this.name = name;
        this.id = id;
    }

    @Override
    public String toString() {
        return id+" : "+name;
    }

    public int compareTo(Object o){
    int eid1 = id;
    int eid2 = ((Employee)o).id;
    if(eid1 < eid2){
        return -1;
    }
    else if(eid1 > eid2){
        return 1;
    }
    else return 0;
    }

}
public class UserDefinedSorting {
    public static void main(String[] args) {
        Employee e1 = new Employee("Vishal",2010);
        Employee e2 = new Employee("Dipanshu",2015);
        Employee e3 = new Employee("Anupam",2001);
        Employee e4 = new Employee("Sumit",2005);
        TreeSet<Employee> emp = new TreeSet<>();
        emp.add(e1);
        emp.add(e2);
        emp.add(e3);
        emp.add(e4);
//        emp.add(e5);
        System.out.println(emp);
        TreeSet<Employee> emp1 = new TreeSet<>(new MyComparator());
        emp1.add(e1);
        emp1.add(e2);
        emp1.add(e3);
        emp1.add(e4);
        System.out.println(emp1);
    }
}
class MyComparator implements Comparator{
    public int compare(Object o1,Object o2){
        Employee e1 = (Employee) o1;
        Employee e2 = (Employee) o2;
        String name1 = e1.name;
        String name2 = e2.name;
        return name1.compareTo(name2);
    }
}