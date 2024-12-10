package com.collection.question;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;

class Student implements Comparable<Student> {
    int roll;
    String name;

    public Student(int roll, String name) {
        this.roll = roll;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "roll=" + roll +
                ", name='" + name + '\'' +
                '}';
    }

//    @Override
//    public int compareTo(Student o) {
//        return Integer.compare(this.roll,o.roll);
//    }

    @Override
    public int compareTo(Student o) {
        return this.name.compareTo(o.name);
    }
}
public class TreeMapDemo {
    public static void main(String[] args) {
        TreeMap<Student,String> tmap = new TreeMap<Student,String>();
        tmap.put(new Student(101,"Shiva"),"Indore");
        tmap.put(new Student(121,"Raj"),"Bhopal");
        tmap.put(new Student(103,"Pushpraj"),"Indore");
        tmap.put(new Student(120,"Yash"),"Dewas");
        tmap.put(new Student(126,"Amit"),"Indore");
        tmap.put(new Student(115,"Sumit"),"Ujjain");
        tmap.put(new Student(109,"Avinash"),"Indore");
        tmap.put(new Student(105,"Shivam"),"Ujjain");

        for(Map.Entry<Student,String> t : tmap.entrySet()){
            System.out.println(t.getKey()+"---->"+t.getValue());
        }
    }
}
