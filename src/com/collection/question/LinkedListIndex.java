package com.collection.question;

import java.util.*;

public class LinkedListIndex {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(100);
        linkedList.add(211);
        linkedList.add(432);
        System.out.println(linkedList);

        Map<String,Integer> names = new LinkedHashMap<>();
        names.put("Vishal",22);
        names.put("Manish",23);
        names.put("Ujjawal",25);

        for(Map.Entry<String,Integer> s:names.entrySet()){
            System.out.println(s.getKey()+"---->"+s.getValue());
        }
        System.out.println("-----------------------");
        Iterator itr = names.entrySet().iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }
        names.entrySet().stream().sorted().forEach(d-> System.out.println(d.getKey()+"-->"+d.getValue()));

        names.entrySet().stream().forEach(d-> System.out.println(d.getKey()+" : "+d.getValue()));
    }
}
