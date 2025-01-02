package com.designpattern;

public class Singleton {

    private static Singleton singleton;

    private Singleton(){
        try {
            Thread.sleep(100); // Artificial delay
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public static Singleton getInstance(){

        if(singleton==null){

            synchronized (Singleton.class){
                if(singleton==null){
                    singleton = new Singleton();
                }
            }
        }
        return singleton;
    }
}
