package com.collection.question;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class CopyArrayList {

    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i =1;i<=10;i++){
            arr.add(i);
        }
        System.out.println(arr);
//        first way to copy arraylist element to other arraylist object
        ArrayList<Integer> arr2 = new ArrayList<>(arr);
        arr2.add(5,1092);
        System.out.println(arr2);

//        second way to copy arraylist
        ArrayList<Integer> arr3 = new ArrayList<Integer>();
        Iterator<Integer> itr = arr.iterator();
        while (itr.hasNext()){
            Integer i = itr.next();
            arr3.add(i);
        }

        System.out.println("Copy element :"+arr3);

        Collections.copy(arr,arr2);
        System.out.println("Array 1:"+arr);
    }
}
