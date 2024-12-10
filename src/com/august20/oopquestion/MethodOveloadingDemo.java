package com.august20.oopquestion;
interface  demo{
    int a=10;
}
class A{
    public void show(){
        System.out.println("A class method without parameter");
    }
    public void show(int a){
        System.out.println("A class change return value show method");
    }
}
public class MethodOveloadingDemo  {
    public static void main(String[] args) {
        A a = new A();
        a.show();a.show(10);
        System.out.println(demo.a);
    }
}
