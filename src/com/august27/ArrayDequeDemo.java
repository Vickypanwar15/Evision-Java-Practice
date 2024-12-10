package com.august27;

import java.util.ArrayDeque;
import java.util.Iterator;

public class ArrayDequeDemo {
    public static void main(String[] args) {
        ArrayDeque<Integer> que = new ArrayDeque<>(3);
        que.add(2100);
        System.out.println(que);

        que.addLast(4320);
        System.out.println(que);

        que.offerLast(20000);
        System.out.println(que);

        que.add(2111);
        System.out.println(que);

        que.addFirst(20911);
        System.out.println(que);

        que.offerFirst(10000);
        System.out.println(que);

        que.offerLast(2100);
        System.out.println(que);

        ArrayDeque<Integer> second = new ArrayDeque<>();
        second = que.clone();
        System.out.println("Copy are :"+second);
        System.out.println(second.element());
        Iterator itr = second.iterator();
        while (itr.hasNext()){
            System.out.print(itr.next()+" , ");
        }
        System.out.println();
        itr = second.descendingIterator();
        System.out.println("Reverse order print:");
        while (itr.hasNext()){
            System.out.print(itr.next()+" , ");
        }
        System.out.println();
        System.out.println(second.peekFirst());
        System.out.println(second.pollLast());  // return and remoce the last element
        System.out.println(second);

    }
}
