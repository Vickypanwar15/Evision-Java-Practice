package com.thread.sept2;
class Display{
    public  void wish(String name){

        synchronized (this){
            for (int i =0;i<5;i++){
                System.out.print("Good Morning :");
                try{
                    Thread.sleep(2000);
                }
                catch (InterruptedException e){
                    System.out.println("I got interuppted");
                }
                System.out.println(name);
            }
        }


    }
}
class MyThread11 extends Thread{
    Display d;
    String  name;
    MyThread11(Display d,String name){
        this.d=d;
        this.name=name;
    }

    @Override
    public void run() {
        d.wish(name);
    }
}
public class SynchronizedDemo {

    public static void main(String[] args) {
        Display d1 = new Display();
        MyThread11 m = new MyThread11(d1,"Vishal");
        MyThread11 m2 = new MyThread11(d1,"Aakash");
        m.start();
        m2.start();
//        m.interrupt();
        try {
            m.join();// main method wait until m Thread completed

//       if we are comment below line than irregular output is show main method thread mix with child thread
            m2.join();

        }
        catch (InterruptedException e){
            System.out.println("You got interrupted");
        }
        for (int i =0;i<5;i++){
            System.out.println("Main method thread");
        }
        d1 = null;
    }
}
