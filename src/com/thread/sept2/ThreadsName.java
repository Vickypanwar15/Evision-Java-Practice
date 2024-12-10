package com.thread.sept2;
class House implements  Runnable{

    @Override
    public void run() {
        Thread.currentThread().setName("House thread");
        for (int i =1;i<=20;i++){
            System.out.println(Thread.currentThread().getName()+" "+ (i+10));
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
class Office implements Runnable{
    @Override
    public void run() {
        Thread.currentThread().setName("Office thread");
        for (int i =1;i<=20;i++){
            System.out.println(Thread.currentThread().getName());
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

public class ThreadsName {
    public static void main(String[] args) throws InterruptedException {
        House h1 = new House();
        Office o1 = new Office();
        Thread t1 = new Thread(h1);
        Thread t2 = new Thread(o1);
        t1.start();
        t2.start();
        t1.setPriority(7);
        t2.setPriority(3);
        System.out.println("Ending of program");
        t2.join();
    }
}
