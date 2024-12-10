package com.august26setmap;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class RemoveOddKeyEntry {
    public static void main(String[] args) {
        Map<Integer,String> hmap = new HashMap<>();
        hmap.put(1021,"Avinash");
        hmap.put(1232,"Vishal");
        hmap.put(1011,"Vishal");
        hmap.put(1007,"Shivay");
        hmap.put(1034,"Anupam");
        hmap.put(1035,"Sumit");
        System.out.println("Map entry present are :");
        for(Map.Entry<Integer,String> h:hmap.entrySet()){
            System.out.println(h.getKey()+" : "+h.getValue());
        }
        System.out.println("--------------------------");
        hmap.entrySet().removeIf(hmap1->hmap1.getKey()%2!=0);

        System.out.println("Map entry present are :");
        for(Map.Entry<Integer,String> h:hmap.entrySet()){
            System.out.println(h.getKey()+" : "+h.getValue());
        }

    }
}
