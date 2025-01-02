package com.collection.question;

import java.util.HashSet;

public class HashSetDemo {

    public static void main(String[] args) {
        HashSet<Integer> list = new HashSet<>();
        for(int i=100;i<200;i++){
            list.add(i);
            list.add(5433);
        }
        System.out.println(list);
    }
}
