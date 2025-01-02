package com.inheritance;

interface A1{
    default void show(){
        System.out.println("INterface a show method");
    }
}

class Demo1 implements A1{
    @Override
    public void show() {
        System.out.println("demo1 class show method called");
    }

    public void method2(){
        System.out.println("Demo1 mthod 2 called");
    }
}
class Demo2 implements A1{
  public void demo2Method(){
      System.out.println("Class demo2");
  }
}
public class InterfaceDemo {

    public static void main(String[] args) {
        Demo1 d = new Demo1();
        d.show();
        Demo2 d2 = new Demo2();
        d2.show();

        A1 obj = new Demo1();
        obj.show();
    }
}
