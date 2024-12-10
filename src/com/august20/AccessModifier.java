package com.august20;

import java.util.Scanner;

class A{
    public int value = 100;
    protected void showValue(){
        System.out.println("Value is :"+value);

        value = new Scanner(System.in).nextInt();

        System.out.println("Value is :"+value);
    }
    void showData(){
        System.out.println(value);
    }
}
class B extends  A{
    B(int num){
        super.value = num;
        System.out.println("Constructor called in B class");
    }
}
public class AccessModifier {
    public static void main(String[] args) {
        A obj = new A();
        obj.showValue();
        obj.showData();
        B obj1 = new B(200011);
        System.out.println(obj1.value);
    }
}
