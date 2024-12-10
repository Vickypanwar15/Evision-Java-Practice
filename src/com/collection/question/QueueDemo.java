package com.collection.question;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class QueueDemo {
    public static void main(String[] args) {
        Queue<String> s = new LinkedList<>();
//        If queue is full then add method throws an exception
        s.add("Vishal");
        s.add("Avinash");
        s.add("Shiva");
        s.add("Ankush");
        s.add("Suraj");
        s.add("Dipanshu");
        System.out.println(s);

//        If queue is full then offer() method return false;
        System.out.println(s.offer("Vishwas"));
        System.out.println(s);

//        remove() method remove the first element of queue
        System.out.println(s.remove());
        System.out.println(s);

//        Poll() method remove and return first element from the queue
        System.out.println(s.poll());
        System.out.println(s);

//        element() method give the first element from the queue without removal if queue is empty it throws exception
        System.out.println(s.element());
        System.out.println(s);

//        peek() method return  the first element without remove of queue if queue is empty it return null
        System.out.println(s.peek());
        System.out.println(s);

        Iterator<String> itr = s.iterator();
        while (itr.hasNext()){
            String str = itr.next();
            if(str.contains("i")){
                itr.remove();
            }
        }
        System.out.println(s);
    }
}
