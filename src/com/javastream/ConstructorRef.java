package com.javastream;

interface  myInteref{
    public  Student get(String name,int age,int roll);
}
class Student{
    String name;
    int age;
    int roll;

    public Student(String name,int age,int roll){
        this.name  = name;
        this.age = age;
        this.roll= roll;

        System.out.println("Name :"+name+" , Age :"+age+" , "+"Roll : "+roll);

    }

    public Student(){

    }

}
public class ConstructorRef {
    public static void main(String[] args) {
        myInteref m = Student::new;
        m.get("Vishal",23,1001);
    }
}
