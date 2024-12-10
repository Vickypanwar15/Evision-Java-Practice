package com.august21;

import org.w3c.dom.ls.LSOutput;

class OuterClass{
    int num;

    OuterClass(){
        System.out.println("Outer class constructor called");
    }
    public static class InnerClass{
        static String str = "Inner Class";
        InnerClass(){
            System.out.println("InnerClass Constructor called");
        }
        OuterClass o1 = new OuterClass();
        public void show(){
            System.out.println(o1.num);
        }
    }
    public class Others extends InnerClass{
        Others(){
            System.out.println("Others class constructor called");
        }
       public  void displayData(){
           System.out.println("Inner class static variable value:"+str);
       }
    }
}
public class StaticClassDemo {
    public static void main(String[] args) {
        OuterClass.InnerClass obj = new OuterClass.InnerClass();
        obj.show();
        OuterClass outer = new OuterClass();
        OuterClass.Others oth = outer.new Others();
        oth.displayData();
    }
}
