package com.thread.sept2;

class Person extends  Thread{
    @Override
    public void run() {
        for (int i =1;i<=3;i++){
            System.out.println("Person Thread Executing.."+Thread.currentThread().getName());
        }
    }
}
public class JoinMethodDemo {
    public static void main(String[] args) throws InterruptedException {
        Person p = new Person();
        p.start();

        p.join();  // main Thread waiting until person thread executing
        for (int i =0;i<5;i++){
            System.out.println("Main Thread executing"+Thread.currentThread().getName());
        }
    }
}
