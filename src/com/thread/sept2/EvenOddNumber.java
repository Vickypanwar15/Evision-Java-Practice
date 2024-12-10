package com.thread.sept2;
class Even implements Runnable{
    @Override
    public void run() {
        for(int i =1;i<=20;i++){
            if(i%2==0){
                System.out.println("Even number : "+i);
            }
        }
    }
}
class Odd implements Runnable{
    @Override
    public void run() {
        for (int i =1;i<=20;i++){
            if(i%2!=0){
                System.out.println("Odd Number : "+i);
            }
        }
    }
}

public class EvenOddNumber {
    public static void main(String[] args) {
        Even e1 = new Even();
        Odd o1 = new Odd();
        Thread t1 = new Thread(e1);
        Thread t2 = new Thread(o1);
        t1.start();
        t2.start();
        t1.setPriority(10);
        t2.setPriority(9);
        Thread.currentThread().setPriority(1);
//        System.out.println("t1 priority :"+t1.getPriority());
//        System.out.println("t1 priority :"+t2.getPriority());
//        System.out.println("t1 priority :"+t1.getPriority());
        for (int i =0;i<=100;i++){
            System.out.println("Main Thread");

            System.out.println("Value of i in main thread:"+i);
    }

    }
}
