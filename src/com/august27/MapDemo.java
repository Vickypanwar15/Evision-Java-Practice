package com.august27;

import java.util.*;

public class MapDemo {
    public static void main(String[] args) {
        HashMap h1 = new HashMap();
        h1.put(101,"Manager");
        h1.put(201,"Project Coordinator");
        h1.put(103,"Team leader");
        h1.put(110,"Senior Developer");
        h1.put("ABC",12220);
        h1.put(210,"Junior Developer");
        h1.put("Evision","Devloper");
        System.out.println("Hashmap h1 entries:"+h1);
        System.out.println(h1.size());
        HashMap m2 = new HashMap();
        m2.put("m--map",20000);
        System.out.println(m2);
        m2.putAll(h1);
        m2.put(2300,"End");
        System.out.println("Hashmap 2 entries:"+"\n"+m2);

        System.out.println(m2.putIfAbsent(102,"Vishal"));
        System.out.println(m2.putIfAbsent(101,"maash"));
        System.out.println(m2);

        m2.put(234.545f,1000000);
        System.out.println(m2);
        Set s1 = m2.keySet();
        System.out.println(s1);

        System.out.println(m2.get(201));

        Collection c1 = m2.values();
        System.out.println("All Keys in Map:"+"\n"+s1);
        System.out.println("All Values in Map:"+"\n"+c1);

        Set s2 = m2.entrySet();
        System.out.println(s2);

//        Iterate from map object
        Iterator itr = s2.iterator();
        while (itr.hasNext()){
            Map.Entry m1 = (Map.Entry)itr.next();
            System.out.println(m1.getKey()+" : "+m1.getValue());

            if(m1.getValue().equals(20000)){
                m1.setValue(45000);
            }
        }
        System.out.println(m2);
    }
}
