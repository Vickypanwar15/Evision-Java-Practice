package com.streampractice;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class SecondSmallestLargest {
    public static void main(String[] args) {
        List<Integer> list  = Arrays.asList(34,45,32,12,54,65,31,57,87,78,56,98,76);
        list.stream().sorted().forEach(n1-> System.out.print(n1+" "));
        System.out.println();
        System.out.println("Second Smallest elements");
        list.stream().sorted().distinct().skip(1).limit(1).forEach(n-> System.out.println(n));
//        System.out.println(s.toString());
        System.out.println("Second largest elements");
        list.stream().sorted(Comparator.reverseOrder()).skip(1).limit(1).forEach(n-> System.out.println(n));


    }
}
