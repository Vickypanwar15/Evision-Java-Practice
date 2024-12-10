package com.preparation;

class Parent{
    int num=100;
    public void show(){
        System.out.println("Parent class show Methods");
    }
}
class Child extends Parent{
    int num;
    public void display(){
        System.out.println("Display method of child class");
    }
}


public class CastingDemo {
    public static void main(String[] args) {
        Parent p = new Child();
        p.show();
//        p.display();
        Child c1 = new Child();
        System.out.println("Child class variable:"+c1.num);
        System.out.println("Parent class Variable:"+p.num);
    }
}
