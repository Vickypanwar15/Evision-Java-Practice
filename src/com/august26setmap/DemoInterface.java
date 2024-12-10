package com.august26setmap;

interface A{
     public static void show(){
        System.out.println("A interface method");
    }
}
interface B{
    public static void show(){
        System.out.println("B interface method");
    }
}
public class DemoInterface implements A,B {

    public static void main(String[] args) {
        DemoInterface d = new DemoInterface();
        B.show();
    }
}
