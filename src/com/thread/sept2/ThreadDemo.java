package com.thread.sept2;

class MyThread extends  Thread{
    public void run(){
        System.out.println("Child Thread Method");
        for (int i = 1;i<=5;i++){
            System.out.println("Child Thread");
            try{
                Thread.sleep(1000);
            }
            catch (InterruptedException e){}
        }
    }
}
public class ThreadDemo {
    public static void main(String[] args) {
        MyThread thread = new MyThread();
        thread.start();
        for (int i =1;i<=5;i++){
            System.out.println("Main Thread");
            try {
                Thread.sleep(1000);
            }
            catch (InterruptedException e){}
        }
    }
}
