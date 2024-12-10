package com.august26setmap;

import java.util.TreeSet;

public class TreeSetDemo {
    public static void main(String[] args) {
        TreeSet<Integer> t1  = new TreeSet<Integer>();
        t1.add(300);
        t1.add(234);
        t1.add(212);
        t1.add(278);
        t1.add(456);
        t1.add(343);
        System.out.println(t1.first());
        System.out.println(t1.last());
        System.out.println(t1);

        System.out.println(t1.headSet(278)); // all elements print which <278

        System.out.println(t1.tailSet(300)); //all elements print which >=300

        System.out.println(t1.subSet(300,456)); // 300 > = elements <456


        TreeSet t2 = new TreeSet();
//        t2.add(new StringBuffer("A"));
//        t2.add(new StringBuffer("K"));
//        t2.add(new StringBuffer("Z"));
//        t2.add(new StringBuffer("D"));
        t2.add(new StringBuilder("A"));
        t2.add(new StringBuilder("K"));
        t2.add(new StringBuilder("Z"));
        t2.add(new StringBuilder("D"));
        System.out.println(t2);

    }
}
