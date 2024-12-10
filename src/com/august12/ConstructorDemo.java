package com.august12;
class Person{
    int roll;
    String name;
    public Person(){
        System.out.println("Defualt construvtor");
    }
    public Person(int roll,String name){
        this.roll=roll;
        this.name=name;
    }
    public  Person(Person p){
        this.roll = p.roll;
        this.name = p.name;
    }
}
public class ConstructorDemo {
    public static void main(String[] args) {
       Person s = new Person(1001,"XYZ");
        Person s1 = new Person();
        System.out.println(s.roll+": "+s.name);
        Person p3 = new Person(s);
        System.out.println(p3.roll+" : "+p3.name);
        Person p4 = new Person(p3);
        System.out.println(p4.roll+" : "+p4.name);

    }
}
