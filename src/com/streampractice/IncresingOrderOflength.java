package com.streampractice;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class IncresingOrderOflength {
    public static void main(String[] args) {
        List<String> l = Arrays.asList("Vishal","ABC","Vivo","goa","Avinash","Abhi","Shiva","go");
        l.stream().sorted(Comparator.comparingInt(String::length)).forEach(System.out::println);

        System.out.println("----------------------------");
        List<String> list1 = l.stream().sorted(Comparator.comparingInt(String::length)).collect(Collectors.toList());

        System.out.println(list1);
    }
}
