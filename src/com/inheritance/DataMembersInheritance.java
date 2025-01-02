package com.inheritance;

class A{
    private int num1;
    protected int num2;
    int num3;
}
class B extends  A{
    int num2=100;

    public B(int b,int c){
        System.out.println("Parent Num2:"+super.num2);
        System.out.println("Child Num2:"+this.num2);
        super.num2 = b;
        num3 = c;
        System.out.println("---------------------------------");
        System.out.println("Child class Num2:"+this.num2);
        System.out.println("Parent Num2:"+super.num2);

    }
}
public class DataMembersInheritance {
    public static void main(String[] args) {
        B b = new B(10,20);

    }
}
