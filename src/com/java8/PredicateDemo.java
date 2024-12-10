package com.java8;

import java.util.function.Predicate;

public class PredicateDemo {
    public static void main(String[] args) {
        int[] arr = {0,5,10,15,20,25,30,35,40};
        Predicate<Integer> p = i -> i>=10;
        Predicate<Integer> p1 = i-> i%2==0;
        System.out.println("Number reater than 10");
        m1(p,arr);
        System.out.println();
        System.out.println("Number which is divisibl by 2");
        m1(p1,arr);
        System.out.println("Joining to predicate");
        System.out.println("Numbers which is grater than AND divisible by 2");
        m1(p.and(p1),arr);

        System.out.println("Number greate than 10 OR divisible by 2");
        m1(p.or(p1),arr);

        System.out.println("negate method in predicate");
        m1(p.negate(),arr);
    }
    public  static void m1(Predicate<Integer> p,int[] arr){
        for (int x1 :arr){
            if(p.test(x1)){
                System.out.print(x1+" ");
            }
        }
        System.out.println();
    }
}
