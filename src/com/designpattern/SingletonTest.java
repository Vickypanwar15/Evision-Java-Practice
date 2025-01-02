package com.designpattern;

public class SingletonTest {

    public static void main(String[] args) {
        Runnable task = ()->{
            Singleton singleton = Singleton.getInstance();
            System.out.println(Thread.currentThread().getName()+" : got instance "+singleton);
        };
        // Create multiple threads
        Thread[] threads = new Thread[1000];
        for (int i = 0; i < threads.length; i++) {
            threads[i] = new Thread(task, "Thread-" + i);
            threads[i].start();
        }
    }
}
