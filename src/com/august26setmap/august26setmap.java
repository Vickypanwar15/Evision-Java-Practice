package com.august26setmap;

import java.util.ArrayList;
import java.util.HashSet;

public class august26setmap {
    public static void main(String[] args) {
        HashSet country = new HashSet();
        country.add("India");
        country.add("America");
        country.add("Nepal");
        country.add("Paris");
        country.add("Pakishtan");
        country.add("India"); // here India is duplicate it not add in the hashset
        System.out.println(country);
        country.add("Bharat");
        country.add(null);
        System.out.println(country.contains("Bharat"));

        ArrayList lst1 = new ArrayList(country);
        System.out.println(lst1);
        lst1.add(2,"India");


        System.out.println(country.retainAll(lst1));

        System.out.println(country);
        lst1.add(null);
        lst1.add(4,null);
        System.out.println(lst1);

//        System.out.println(lst1.get(3));


    }
}
