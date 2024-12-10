package com.august20;

import java.io.Serializable;

class Student{
    String name;
    int age;
    public Student getData(String name,int age){
        this.name=name;
        this.age = age;
        return  this;
    }

    @Override
    public String toString() {
        return "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
    public int showData(){
        System.out.println("Employee class show method");
        return 1;
    }
}
class Admin extends Student{
    public Admin getData(String name,int age){
        this.name=name;
        this.age = age;
        return  this;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
public class MethodSignature {
    public static void main(String[] args) {
        Student s1  = new Student().getData("Vishal",24);
        System.out.println(s1);
        Admin a1 = new Admin().getData("Admin@123",45);
        System.out.println(a1);

        System.out.println(a1 instanceof Student);
        System.out.println(s1 instanceof  Object);
        System.out.println(s1 instanceof Cloneable);
        System.out.println(s1 instanceof Serializable);
    }
}
