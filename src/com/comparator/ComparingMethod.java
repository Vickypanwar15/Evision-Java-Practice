package com.comparator;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

class Student{
    private Integer roll;
    private String name;
    private String Course;
    private Integer age;

    public Student(Integer roll, String name, String course, Integer age) {
        this.roll = roll;
        this.name = name;
        Course = course;
        this.age = age;
    }

    public Integer getRoll() {
        return roll;
    }

    public void setRoll(Integer roll) {
        this.roll = roll;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCourse() {
        return Course;
    }

    public void setCourse(String course) {
        Course = course;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student { " +
                "roll=" + roll +
                ", name='" + name + '\'' +
                ", Course='" + Course + '\'' +
                ", age=" + age +
                '}';
    }
}
public class ComparingMethod {

    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student(2001,"Himanshu","Engineer",24));
        students.add(new Student(2023,"dipanshu","Management",23));
        students.add(new Student(2021,"Vishal","Engineer",19));
        students.add(new Student(2007,"Suraj","Nursing",20));
        students.add(new Student(2004,"Amit","Management",31));
        students.add(new Student(2010,"aarti","Pharmacy",25));
        students.add(new Student(2016,"Yash","Nursing",26));
        students.add(new Student(2012,"Sawan","Management",28));
        students.add(new Student(2018,"Ankit","Engineer",32));
        students.add(new Student(2006,"chetan","Nursing",35));
        students.add(new Student(2000,"Harsh","Pharmacy",22));
        students.add(new Student(2019,"Deven","Engineer",36));

        for (Student s:students){
            System.out.println(s);
        }

        System.out.println("--------SORT BY STUDENTS NAME---------");
//        students.stream().sorted(Comparator.comparing(Student::getName)).forEach(System.out::println);
//        using the above method case-sensitive is also preferred to resolve this we use

        students.stream().sorted(Comparator.comparing(Student::getName,String.CASE_INSENSITIVE_ORDER)).forEach(System.out::println);


        System.out.println("----------------------------------------------------------");

        System.out.println(" ------------SORT BY AGE IN DESCENDING ORDER -------------");
        students.stream().sorted(Comparator.comparingInt(Student::getAge).reversed()).forEach(System.out::println);

//        Student::getAge  is written ----> student->student.getAge() in lambda expression

//        Comparator method is thenComparing()

        System.out.println("----------------------------------------------------------");
        System.out.println("----------------------------------------------------------");
        students.stream().sorted(Comparator.comparing(Student::getName)
                        .thenComparingInt(Student::getRoll)).forEach(System.out::println);
        System.out.println("Null values from student list");


        System.out.println(" ************* Limit methods in student list **********");
        students.stream().limit(5).forEach(System.out::println);

        System.out.println("------------- Skip  methods in student list -----------");
        students.stream().skip(3).forEach(System.out::println);

    }
}
