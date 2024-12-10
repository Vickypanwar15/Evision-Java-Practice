package com.august26setmap;

import java.util.Comparator;
import java.util.TreeSet;

public class DesendingSorting {
    public static void main(String[] args) {
        TreeSet<Integer> t1 = new TreeSet<Integer>(new MyComparator1());
                t1.add(0);
        t1.add(300);
        t1.add(232);
        t1.add(212);
        t1.add(3003);
        t1.add(400);
        System.out.println(t1);
    }
}
class MyComparator1 implements Comparator{
    public int compare(Object o1,Object o2){
        Integer i1 = (Integer)o1;
        Integer i2 = (Integer) o2;
        return i2.compareTo(i1);
    }
}