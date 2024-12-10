package com.thread.sept2;

import java.time.LocalTime;
import java.time.chrono.ChronoLocalDateTime;
import java.util.Date;

public class SynchronizedDemo11 {
    String msg;
    public SynchronizedDemo11(String msg){
        this.msg = msg;
    }
    public static void main(String[] args) {
        Runnable r1 = new Runnable() {
            @Override
            public void run() {
                for (int i=0;i<5;i++){
                    LocalTime t = LocalTime.now();
                    System.out.println("First  Thread started at :"+t);
                    try{
                        Thread.sleep(1000);
                    }
                    catch (InterruptedException e){
                        System.out.println("I got intruuppted");
                    }
                }
            }
        };
        Runnable r2 = new Runnable() {
            @Override
            public void run() {
                for (int i=0;i<5;i++){
                    LocalTime t = LocalTime.now();
                    System.out.println("Second  Thread started at :"+t);
                    try{
                        Thread.sleep(1000);
                    }
                    catch (InterruptedException e){
                        System.out.println("I got intruuppted");
                    }
                }
            }
        };

        Thread t1 = new Thread(r1);
        Thread t2 = new Thread(r2);
        t1.start();
        t2.start();

        for (int i=0;i<5;i++){
            System.out.println("Main thread is started");
        }

    }
}
