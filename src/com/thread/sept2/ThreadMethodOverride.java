package com.thread.sept2;

class ThreadDemo11 extends  Thread{
//    If we override start method of thread class then it will work as normal java method nd dont call run method
    public void start(){
        System.out.println("start method called in ");

    }

    @Override
    public void run() {

        for (int i=1;i<=5;i++){
            System.out.println("Child thread");
        }
    }
}

public class ThreadMethodOverride {
    public static void main(String[] args) {
        ThreadDemo11 t1 = new ThreadDemo11();
//        to call start method it is not the Thread class method run because we override that method
//        for this reason a new thread won't be created it run by main thread.
        t1.start();
        for (int i=1;i<=5;i++){
            System.out.println("Main Thread");
        }

    }
}
