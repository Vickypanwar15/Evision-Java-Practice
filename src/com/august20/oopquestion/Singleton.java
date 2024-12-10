package com.august20.oopquestion;
class Single{
    private static Single obj= new Single();
    int count =0;
    private Single(){

    }
    public  static Single getInstance(){
       return obj;
    }
}
public class Singleton {
    public static void main(String[] args) {
        Single s1 = Single.getInstance();
        s1.count = 100;

        System.out.println("Print by s1 :"+s1.count);
        Single s2 = Single.getInstance();
        System.out.println("Print by s2 :"+s2.count);
        System.out.println(s1==s2);
    }
}
