package com.august20;
class Employee{
    int id;
    String name;
    Employee(){
        System.out.println("Employee class Constructor called");
    }
    Employee(int id,String name){
        this.id=id;
        this.name=name;
        System.out.println("Employee class parameterized constructor called");
        System.out.println("ID:"+id+" , "+"Name:"+name);
    }
}
class Manager extends Employee{
    boolean assignTask;
    Manager(){
        System.out.println("Manager class no-argument constructor called");
    }
    Manager(boolean assignTask){
        this.assignTask = assignTask;
        System.out.println("Manager class one parameterized constructor called");

    }
    Manager(int id,String name,boolean assignTask){
        super(id,name);
        this.assignTask = assignTask;
        System.out.println("Manager class three parameterized constructor called");

    }
    Manager(char ch){
        this();
        System.out.println("one parameter constructor called");
    }

    @Override
    public String toString() {
        return id + " : "+name+" : "+assignTask;
    }
}
public class ConstructorChaining {
    public static void main(String[] args) {
//        Employee e1 = new Employee();
//        Employee e2 = new Employee(111,"Vishal");
//        Manager m1 = new Manager();
//        Manager m2 = new Manager(true);
//        Manager m3 = new Manager(202122,"Manager",false);
//
//        Employee e1 = new Manager(303222,"Manager2",true);
        Employee e2 = new Manager('C');
        Object o1 = (Object)new Employee(2222,"Aakash");
        System.out.println(o1);
        Employee e1 = (Employee)o1;
    }
}
