package com.collection.question;

import java.util.LinkedList;

public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList city = new LinkedList();
        city.add("Indore");
        city.add("Bhopal");
        city.add(0,"Delhi");
        city.addFirst("Ujjain");
        System.out.println(city);

        city.addLast("Mumbai");
        city.add(3,"Paris");
        System.out.println(city);
        System.out.println(city.size());

        System.out.println(city.getFirst()+" : "+city.getLast());
        System.out.println(city);
        System.out.println("This element is removed in linkdlist :"+city.removeFirst()+" : "+city.removeLast());
        System.out.println(city);
    }
}
