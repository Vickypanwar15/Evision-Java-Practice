package com.thread.sept2;

import java.time.LocalTime;
import java.util.concurrent.*;

class Task implements Runnable{
    private String name;
    public Task(String name){
        this.name = name;
    }

    @Override
    public void run() {
        try{
            for (int i=0;i<2;i++){
                if(i==0){
                    LocalTime t = LocalTime.now();
                    System.out.println("Intialize Time for task name :"+name+" =  and started by :"+Thread.currentThread().getName()+"  :  "+t);

                }
                else{
                    LocalTime t = LocalTime.now();
                    System.out.println("Executing time for task name :"+name+" =  and started by :"+Thread.currentThread().getName()+"  :  "+t);
                }
                Thread.sleep(2000);
            }
            System.out.println("Task Completed :"+name);
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}

public class ThreadExample  {
    static final int MAX_T = 4;
    public static void main(String[] args) {
        Runnable r1 = new Task("Task-1");
        Runnable r2 = new Task("Task-2");
        Runnable r3 = new Task("Task-3");
        Runnable r4 = new Task("Task-4");
        Runnable r5 = new Task("Task-5");
        Runnable r6 = new Task("Task-6");
        Runnable r7 = new Task("Task-7");
        Runnable r8 = new Task("Task-8");
        Runnable r9 = new Task("Task-9");

        ThreadPoolExecutor pool = new ThreadPoolExecutor(2,MAX_T,5, TimeUnit.SECONDS,
                new ArrayBlockingQueue<>(3),new CustomeThreadPool(),new ThreadPoolExecutor.DiscardPolicy());
        pool.execute(r1);
        pool.execute(r2);
        pool.execute(r3);
        pool.execute(r4);
        pool.execute(r5);
        pool.execute(r6);
        pool.execute(r7);
        pool.execute(r8);
        pool.execute(r9);
        pool.shutdown();

    }
}
