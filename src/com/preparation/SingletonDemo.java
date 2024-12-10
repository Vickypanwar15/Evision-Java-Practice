package com.preparation;

class Singleton{
    private static Singleton single=null;

    private Singleton(){

    }
    public static Singleton getInstance(){
        if(single==null){
            single =  new Singleton();
        }
        return  single;
    }
}

public class SingletonDemo {
    public static void main(String[] args) {
        Singleton singleton1 = Singleton.getInstance();
        System.out.println(singleton1);

        Singleton singleton2 = Singleton.getInstance();
        System.out.println(singleton2);
    }
}
