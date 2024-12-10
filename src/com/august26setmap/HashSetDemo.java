package com.august26setmap;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;

public class HashSetDemo {
    public static void main(String[] args) {
        List<Integer> lst = new ArrayList<>();
        lst.add(3122);
        lst.add(3433);
        lst.add(6765);
        lst.add(2,1234);
        System.out.println(lst.size());
        lst.add(lst.size()-1,10000);
        lst.add(5837);
        lst.add(1234);
        lst.add(6765);
        System.out.println("ArrayList :" +"\n"+lst);

        HashSet<Integer> set = new HashSet<Integer>(lst);
        System.out.println("Remove duplicates from list :"+"\n"+set);
        LinkedHashSet<Integer> l = new LinkedHashSet<>(lst);
        System.out.println(l);


    }
}
