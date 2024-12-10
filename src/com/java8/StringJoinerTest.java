package com.java8;

import java.util.ArrayList;
import java.util.StringJoiner;

public class StringJoinerTest {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("Anudip");list.add("Vikrant");list.add("Medicaps");list.add("Evision");
        StringJoiner s1 = new StringJoiner(",","& "," ?");
        s1.add(list.get(0)).add(list.get(2));
        System.out.println(s1.toString());

        StringJoiner sj1 = new StringJoiner("$");
        sj1.setEmptyValue("No value present");
        System.out.println(sj1.toString());
        sj1.add("Avesham").add("Radhe");
        System.out.println(sj1.toString());
        sj1.merge(s1);
        System.out.println("Merging Elements s1 to sj1 :"+sj1.toString());
        s1.merge(sj1);
        System.out.println("Merging Elements sj1 to s1 :"+s1.toString());
    }
}
