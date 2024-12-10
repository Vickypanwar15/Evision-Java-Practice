package com.august20;
class Parent{
    int a,b;
    Parent(){
        System.out.println("Parent class contractor called");
    }
    public void parentMsg(){
        System.out.println("Method of parent class");
    }
}
class  Child extends Parent{
    int a=20;
    Child(){
        super.a=100;
        System.out.println("Child class constructor called :"+super.a);
    }
    public  void childMsg(){
        System.out.println("Child class msg method called");
    }
}
public class UpAndDownCasting {
    public static void main(String[] args) {
        Parent p1 = new Parent();
        p1.parentMsg();
        Parent p2 = new Child();
        p2.parentMsg();
//        p2.childMsg();  when we perform Upcasting than child class method is not called by the parent class reference

        Child c1 = new Child();
        System.out.println(c1.a+" : "+c1.b);
        Child c2 = (Child)p2;
        c2.a =  10;
        c2.b = 50;
        System.out.println(c2.a+" : "+c2.b);

        Parent p3 = p1;
        System.out.println(p1==p3);

        System.out.println("c1:"+c1.a);
    }
}
