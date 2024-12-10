package com.august28;

import java.util.*;

public class CreatingHashMap {
    public static void main(String[] args) {

        // it will creates a defalt hashmap object with capacity = 16 and fill ration = 0.75
        HashMap<Integer,String> hmap1 = new HashMap<>();

        HashMap<String,Integer> hmap2 = new HashMap<>(30);// initialization hashmap with 30 capacity


//        initial capacity = 30 and fill ration = 0.6
        HashMap<Integer,String> map3 = new HashMap<>(30,0.6f);

//
//        HashMap<Integer,String > map4 = new HashMap<>(map3);

        hmap1.put(101,"Cricket");
        hmap1.put(201,"Football");
        hmap1.put(202,"Cricket");

//      hmap1.put(101,"Apple");  it retune Cricket becaue 101 key already available in hmap1
        String s1 = hmap1.put(101,"Apple");
        System.out.println("Value of s1 :"+s1); //Cricket
        System.out.println(hmap1);

        map3.putAll(hmap1);

        map3.put(23,"Vishal");
        map3.put(25,"Dipanshu");
        map3.put(30,"ABC");
        System.out.println(map3);

        for(Map.Entry<Integer,String> e : map3.entrySet()){
            if (e.getKey()==101){
                e.setValue("Varun");
            }
            System.out.println(e.getKey()+" : "+e.getValue());
        }
        System.out.println(map3);

        map3.put(null,"Avinash");
        System.out.println(map3);
        map3.put(null,"Vikas");
        System.out.println(map3);
    }
}
