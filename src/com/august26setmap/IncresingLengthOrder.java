package com.august26setmap;

import java.util.Comparator;
import java.util.TreeSet;

public class IncresingLengthOrder {
    public static void main(String[] args) {
        TreeSet t = new TreeSet(new IncresingLength());
        t.add("A");
        t.add(new StringBuffer("ABC"));
        t.add(new StringBuffer("AA"));
        t.add("xx");
        t.add("Z");
        t.add("ABCD");
        t.add("A");
        System.out.println(t);
    }
}
class  IncresingLength implements Comparator{
    public int compare(Object o1,Object o2){
        String s1 = o1.toString();
        String s2 = o2.toString();
        if(s1.length()<s2.length()){
            return -1;
        }
        else if(s1.length()>s2.length()){
            return  1;
        }
        else {
            return s1.compareTo(s2);
        }
    }
}