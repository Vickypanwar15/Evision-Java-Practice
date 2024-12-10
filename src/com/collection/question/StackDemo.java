package com.collection.question;

import java.util.Stack;

public class StackDemo {
    public static void main(String[] args) {
        Stack<Object> s1 = new Stack<Object>();
        s1.add(2000);
        s1.add("Vishal");
        s1.add(48755F);
        System.out.println(s1);
        s1.push("Evision");
        s1.push(30000);
        System.out.println(s1);
        System.out.println("Remove element is :"+s1.pop());
        System.out.println(s1);
        s1.add(2,"Malhal Mall");
        System.out.println(s1);
        s1.remove(3);
        System.out.println(s1);
        System.out.println(s1.get(3)+" : "+s1.get(1));
        System.out.println(s1.isEmpty());
//        s1.clear();
        System.out.println(s1.isEmpty());

        System.out.println(s1.search("Vishal"));
        System.out.println(s1.peek());
    }
}
