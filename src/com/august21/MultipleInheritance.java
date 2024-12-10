package com.august21;

import java.util.Collections;

interface Demo1{
     default  void msg(){
        System.out.println("Interface demo1 msg() method");
    }
}
interface Demo2{
    default void msg(){
        System.out.println("Interface demo2 msg() method");
    }
}
public class MultipleInheritance implements Demo1,Demo2 {
    @Override
    public void msg() {
//        to call the Demo1 Interface method
        Demo1.super.msg();

//        to call the demo2 interface method
        Demo2.super.msg();
    }

    public static void main(String[] args) {
        MultipleInheritance m = new MultipleInheritance();
        m.msg();
    }
}
