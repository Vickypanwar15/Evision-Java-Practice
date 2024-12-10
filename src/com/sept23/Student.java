package com.sept23;

import java.util.ArrayList;
import java.util.List;

public class Student {
        private int roll;
        private String name;
        private int age;
        private String city;

    public Student(int roll, String name, int age, String city) {
        this.roll = roll;
        this.name = name;
        this.age = age;
        this.city = city;
    }

    public int getRoll() {
        return roll;
    }

    public void setRoll(int roll) {
        this.roll = roll;
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

    public void setAge(int age) {
        this.age = age;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return "Student{" +
                "roll=" + roll +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", city='" + city + '\'' +
                '}'+"\n";
    }

    public static List<Student> addStudents(){
        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student(1001,"ram",24,"Indore"));
        studentList.add(new Student(1021,"Ganesh",22,"Indore"));
        studentList.add(new Student(1012,"Raj",26,"Bhopal"));
        studentList.add(new Student(1017,"Vikrant",30,"Indore"));
        studentList.add(new Student(1031,"ram",24,"Indore"));
        studentList.add(new Student(1011,"Anupam",21,"Dewas"));
        studentList.add(new Student(1007,"Rishi",23,"Ujjain"));
        studentList.add(new Student(1020,"shiva",24,"Indore"));
        studentList.add(new Student(1032,"Raj",26,"Bhopal"));


        return studentList;
    }
}
