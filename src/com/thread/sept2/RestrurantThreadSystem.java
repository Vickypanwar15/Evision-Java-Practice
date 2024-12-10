package com.thread.sept2;

import java.util.InputMismatchException;
import java.util.List;
import java.util.Map;

class Restrurant{
    private boolean foodReady  = false;
    public synchronized void prepareFood() throws InterruptedException {
        System.out.println("Chef is preparing food...");

        Thread.sleep(10000);
        foodReady = true;
        System.out.println("Food is ready......");
        notify();
    }

    public synchronized void serveFood() throws InterruptedException{
        while (!foodReady){
            System.out.println("Waiter is waiting for the foo to be ready");
            wait();
        }
        System.out.println("Waiter : is ready to serve the food");
    }

}

public class RestrurantThreadSystem {
    public static void main(String[] args) {
        Restrurant r = new Restrurant();

        Thread chefThread = new Thread(() ->{
            try {
                r.prepareFood();
            }
            catch (InterruptedException i){
                i.printStackTrace();
            }
        });
        Thread waiterThread = new Thread(()->{
            try {
                r.serveFood();
            }
            catch (InterruptedException i){
                i.printStackTrace();
            }
        });
        waiterThread.start();
        chefThread.start();
    }
}
