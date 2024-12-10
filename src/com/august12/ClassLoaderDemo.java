package com.august12;

import java.lang.reflect.Method;

class Student{
    String name;
    int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
public class ClassLoaderDemo {
    public static void main(String[] args) throws Exception {
        int count =0;
        Class c = Class.forName("com.august12.Student");

        Method[] m = c.getDeclaredMethods();
        for(Method m1 :m){
            count++;
            System.out.println(m1);
        }
        System.out.println("Total number of methods:"+count);
        Student s1 = new Student();
        Class c1 = s1.getClass();
        Student s2= new Student();
        Class c2 = s2.getClass();
        System.out.println(c1==c2);
    }
}
