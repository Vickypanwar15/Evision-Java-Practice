package com.collection.question;

import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class LinkedListDemo11 {
    public static void main(String[] args) {
        List<Integer> lst = new LinkedList<Integer>();
//        lst.addFirst(212); // this method is not present in the list interface that the reason we will get error

        LinkedList<String> lst2 = new LinkedList<String>();
        lst2.addFirst("Google");
        lst2.addLast("Amazon");
        lst2.add("Microsoft");  // to add an element in last

        System.out.println(lst2.removeFirst());
        System.out.println(lst2);

        Stack<Integer> s1 = new Stack<>();
       int num =  s1.push(210);
        System.out.println(num);
        System.out.println(s1.push(343));
    }
}
