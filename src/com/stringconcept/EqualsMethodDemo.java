package com.stringconcept;

import java.util.ArrayList;

class Student implements  Cloneable{
    int roll;
    String name;
    static String clgname="VITM INDORE";
    public Student(int roll,String name){
        this.roll=roll;
        this.name=name;
    }

    @Override
    public String toString() {
        return "Roll : "+roll+" , "+"Name : "+name+" , "+"College Name :"+clgname+" \n";
    }

    @Override
    public boolean equals(Object obj) {
        String name1 = this.name;
        int roll1 = this.roll;
        Student copy = (Student) obj;
        String name2= copy.name;
        int roll2 = copy.roll;
        if(name1.equals(name2) && roll1==roll2){
            return  true;
        }
        else
            return false;

    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

public class EqualsMethodDemo {
    public static void main(String[] args) throws CloneNotSupportedException {
        Student[] s = new Student[8];
        s[0] = new Student(101,"Vishal");
        s[1] = new Student(201,"Sumit");
        s[2] = new Student(301,"Anupam");
        s[3] = new Student(101,"Vishal");
        s[4] = new Student(501,"Rahul");
        s[5] = new Student(110,"Rohit");
        s[6] = new Student(301,"Anupam");
        s[7] = new Student(120,"Dipanshu");
//        Student.clgname="BGI Indore";
        ArrayList<Student> commonlist = new ArrayList<>();
        /* to print object than internally is call hashcode() method because by default toString() method is called internally */
//        to print the exact data member value we must be override the toString() method
//        System.out.println(s1+"\n"+s2+"\n"+s4+"\n"+s3);
        for (int i=0;i<s.length;i++){
            for (int j=i+1;j<s.length;j++){
                if(s[i].equals(s[j])){
                    commonlist.add(s[i]);
                    break;
                }
            }

        }
        System.out.println("Duplicate Element prints");
        System.out.println(commonlist);

        Student s1 = new Student(10001,"DK");
        Student s2 = s1;
//        hashcode is same in shallow cloning
        System.out.println(s1.hashCode()+" : "+s2.hashCode());
        Student obj  = (Student)s1.clone();
        System.out.println(s1.hashCode()+" : "+obj.hashCode());

        for (Student sss:s){
            System.out.println(sss);
        }
    }
}
