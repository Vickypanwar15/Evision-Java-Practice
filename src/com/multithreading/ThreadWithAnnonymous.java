package com.multithreading;

public class ThreadWithAnnonymous {
    public static void main(String[] args) {
        Runnable r = ()->{
            for (int i=1;i<=10;i++){
                System.out.println("Thread--->"+i);
            }
        };
        Thread t = new Thread(r);
        t.start();
    }
}
