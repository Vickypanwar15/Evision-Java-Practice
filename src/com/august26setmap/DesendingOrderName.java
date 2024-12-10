package com.august26setmap;

import java.util.Comparator;
import java.util.TreeSet;

public class DesendingOrderName {
    public static void main(String[] args) {
        TreeSet<String> name = new TreeSet<>(new StringComparator());
        name.add("Yellow");
        name.add("Zerox");
        name.add("Visal");
        name.add("Avinash");
        name.add("Knife");
        name.add("Dipanshu");
        name.add("Raja");
        System.out.println(name);
    }
}
class StringComparator implements Comparator{
    public int compare(Object obj1,Object obj2){
        String s1 = obj1.toString();
        String s2 = obj2.toString();
//        return s1.compareTo(s2);
//        There are many ways to perform desending order sorting
//        return -s1.compareTo(s2);
        return  s2.compareTo(s1);
    }
}
