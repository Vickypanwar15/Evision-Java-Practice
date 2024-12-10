package com.august20.oopquestion;

class  Test{
    public void show(String msg){
        System.out.println("This is Test class show method:"+msg);
    }
}
class Demo1 extends Test{
    public void show(String msg) {
        System.out.println("This is Demo class Show method:"+msg);
    }
    public  void display(){
        System.out.println("Display method present in Demo1 class");
    }
}
public class PolymorphismDemo {
    public static void main(String[] args) {
      Test t1 = new Test();
      t1.show("Message-1");
      Test t2 = new Demo1();
      t2.show("Message-2");
      Demo1 d1 = new Demo1();
      d1.show("Message-3");
      d1.display();
    }
}
