package com.collection.question;

import java.util.ArrayList;
import java.util.ListIterator;

public class TraverseInArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        for(int i = 0;i<30;i++){
            arrayList.add(i);
        }
        System.out.println(arrayList);
        ListIterator<Integer> lst = arrayList.listIterator();
        while (lst.hasNext()){
            Integer i = lst.next();

            if(i % 3==0){
                lst.remove();
                lst.add(i+1000);
            }
        }
        System.out.println(arrayList);
        while (lst.hasPrevious()){
            int i = lst.previous();
            System.out.print(i+ " , ");
        }
        System.out.println();
        System.out.println(arrayList);
    }
}
