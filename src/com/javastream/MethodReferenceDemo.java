package com.javastream;
interface  A{
    public void sum(int a,int b);
}
public class MethodReferenceDemo {
    public  static void add(int a,int b){
        System.out.println("Sum is :"+(a+b));
    }


    public static void main(String[] args) {
        A i = (a,b)->System.out.println("Sum of a and b is  :"+(a+b));
        i.sum(45,76);

        A i1 = MethodReferenceDemo::add;
        i1.sum(546,7654);

    }
}
