package com.javastream;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SortedOnStream {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Badal");
        list.add("Soldier");
        list.add("Zerox");
        list.add(2,"Yashoda");
        list.add("indore");
        list.add("bhupesh");
        list.add("Ankush");
        System.out.println(list);

//        sort stream as default sorting order
        List<String> sortedStream =list.stream().sorted().collect(Collectors.toList());
        System.out.println("Default sorting elements");
        System.out.println(sortedStream);

        System.out.println("Custom sorting elements");
        List<String> sort = list.stream().sorted((s1,s2)->
            -s1.toUpperCase().compareTo(s2.toUpperCase())).collect(Collectors.toList());

        System.out.println(sort);

        String min = list.stream().min((s1,s2)->s1.toUpperCase().compareTo(s2.toUpperCase())).get();
        System.out.println("Min value :"+min);

        String max = list.stream().max((s1,s2)->s1.toUpperCase().compareTo(s2.toUpperCase())).get();
        System.out.println("Max value :"+max);

//        to print all collection element using forEach
        System.out.println("For each loop double colon operator uses");
        list.stream().forEach(System.out::println);
    }
}
