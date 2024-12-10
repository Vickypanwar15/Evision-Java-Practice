package com.javastream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class MapAndCollect {
    public static void main(String[] args) {
        List<String> l = new ArrayList<>();
        l.add("vishal");
        l.add("dk");
        l.add("sumit");
        l.add("anupam");
        l.add("sunny");
        l.add("avinash");

        List<String> c = l.stream().map(i->i.toUpperCase()).collect(Collectors.toList());
        System.out.println(c);
        long count = l.stream().filter(i->i.length()>5).count();
        System.out.println("String which length is grater than 5:"+count);
    }
}
