package com.august20.oopquestion;

public class Person {
    private String name;
    private int age;

    Person(String name,int age){
        this.name=name;
        this.age=age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public static void main(String[] args) {
        Person p1 = new Person("Vishal",23);
        Person p2 = new Person("Rahul",25);
        System.out.println(p1.name+" : "+p1.age);
        System.out.println(p2.name+" : "+p2.age);

//        to print Person detals with toString() method
        System.out.println(p1);
        System.out.println(p2);
    }
}
