package com.multithreading;

public class ThreadsDemo {
    public static void main(String[] args) {
        Runnable r1 = new Runnable() {
            @Override
            public void run() {
                for (int i=1;i<=10;i++) {

                    System.out.println("Thread 1 is running..");
                }
            }
        };
        Runnable r2 = new Runnable() {
            @Override
            public void run() {
                for (int i=1;i<=10;i++) {

                    System.out.println("Thread 2 is running..");
                }
            }
        };

        Runnable r3 = new Runnable() {
            @Override
            public void run() {
                for (int i=1;i<=10;i++) {

                    System.out.println("Thread 3 is running..");
                }
            }
        };

        Thread t1 = new Thread(r1);
        Thread t2 = new Thread(r2);
        Thread t3 = new Thread(r3);


        t3.setPriority(9);
        t1.setPriority(6);
        System.out.println("Thread 1 priority:"+t1.getPriority()+"Name:"+t1.getName());
        System.out.println("Thread 2 priority:"+t2.getPriority()+"Name:"+t2.getName());
        System.out.println("Thread 3 priority:"+t3.getPriority()+"Name:"+t3.getName());

        t1.start();
        t2.start();
        t3.start();

        for (int i=1;i<10;i++) {
            System.out.println("Main thread is executing");
        }

    }
}
