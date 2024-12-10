package com.collection.question;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ArrayListDescending {
    public static void main(String[] args) {
        List<Integer> lst  = new ArrayList<>();
        lst.add(324);
        lst.add(343);
        lst.add(234);
        lst.add(256);
        lst.add(300);
        lst.add(433);
        lst.add(200);
        System.out.println(lst);
        Comparator<Integer> comp = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                if(o1 > o2){
                    return  -1;
                }
                else if(o2<o2){
                    return 1;
                }
                else{
                    return 0;
                }
            }
        };
        Collections.sort(lst,comp);
        System.out.println(lst);

    }
}

