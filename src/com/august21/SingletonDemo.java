package com.august21;
class Singleton{
    private static final Singleton s = new Singleton(13232);
    private int num;
    Singleton(int num){
        this.num = num;
    }

    public static Singleton getS() {
        return s;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }
}

public class SingletonDemo {
    public static void main(String[] args) {
        Singleton s1 = Singleton.getS();
        System.out.println("Object 1st value"+s1.getNum()+"--->"+s1);
        Singleton s2 = Singleton.getS();
        s2.setNum(76765);
        System.out.println("After changing value by object-2");
        System.out.println("Object-2 value "+s2.getNum()+"--->"+s2);
        System.out.println("Object-1 value "+s1.getNum()+"--->"+s1);


    }
}
