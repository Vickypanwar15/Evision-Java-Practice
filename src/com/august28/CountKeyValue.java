package com.august28;

import java.util.HashMap;
import java.util.Map;

public class CountKeyValue {
    public static void main(String[] args) {
        HashMap<String,Integer> hmap = new HashMap<String,Integer>();
        hmap.put("A",23);
        hmap.put("S",34);
        hmap.put("Vishal",22);
        hmap.put("Rahul",25);
        hmap.put("null",null);
        System.out.println(hmap);
        int count = 0;
        for (Map.Entry<String,Integer> e : hmap.entrySet()){
            System.out.println(e.getKey()+" : "+e.getValue());
            count++;
        }
        System.out.println("No of key and values :"+count);
//        for (Map.Entry<String,Integer> e : hmap.entrySet()){
//            hmap.remove(e.getKey(),e.getValue());
//        }
//        System.out.println(hmap);
        hmap.clear();
        System.out.println(hmap);
    }
}
