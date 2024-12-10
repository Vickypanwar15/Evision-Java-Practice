package com.thread.sept2;

import java.util.concurrent.*;

public class ThreadPoolDemo {
    public static void main(String[] args) {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(2,4,5,
                TimeUnit.SECONDS,new ArrayBlockingQueue<>(4),Executors.defaultThreadFactory(),new ThreadPoolExecutor.DiscardPolicy());
        for (int i=1;i<=25;i++){
            threadPoolExecutor.submit(()->{
                try{
                    Thread.sleep(5000);
                }
                catch (Exception e){

                }
                System.out.println("Task Processed by :"+Thread.currentThread().getName());
            });
        }
        threadPoolExecutor.shutdown();
    }
}
class CustomeThreadPool implements ThreadFactory {
    @Override
    public Thread newThread(Runnable r) {
        Thread th = new Thread(r);
        return th;
    }
}
class CustomerRejectHandler implements RejectedExecutionHandler{
    @Override
    public void rejectedExecution(Runnable r, ThreadPoolExecutor executor) {
        System.out.println("Task Rejected :"+r.toString());
    }
}