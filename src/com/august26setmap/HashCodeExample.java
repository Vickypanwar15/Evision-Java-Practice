package com.august26setmap;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class HashCodeExample {
    public static void main(String[] args) {
        Student s1 = new Student(1,"Alice");
        Student s2 = new Student(2,"Akshay");
        Student s3 = new Student(1,"Alice");


        HashMap<Student,String> students = new HashMap<>();
        students.put(s1,"A grade");
        students.put(s2,"B grade");
        students.put(s3,"C grade");

        for(Map.Entry<Student,String> h : students.entrySet()){
            System.out.println(h.getKey()+"---->"+h.getValue());
        }
    }
}
class Student{
    private  int id;
    private String name;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return id == student.id && Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        int result = 20;
        result = 21 * result + id;
        result = 21 * result + (name!=null?name.hashCode():0);
        return result;
    }
}
