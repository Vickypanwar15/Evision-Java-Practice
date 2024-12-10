package com.august21;

interface   A{
    default void show(){
        System.out.println("Show method of interface A");
    }
    default void display(){
        System.out.println("Display method of interface A");
    }
    public static int findSquare(int x){
        return x*x;
    }
    public int findFactorial(int n);
}
 class  B implements  A{


     @Override
     public int findFactorial(int n) {
         int f = 1;
         for (int i = 1;i<=n;i++){
             f = f*i;
         }
         return  f;
     }
 }
public class AbstractDemo extends  B{
    public static void main(String[] args) {
        B b = new AbstractDemo();
        b.show();


    }
}
