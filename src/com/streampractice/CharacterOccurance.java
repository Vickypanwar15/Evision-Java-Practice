package com.streampractice;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CharacterOccurance {
    public static void main(String[] args) {
        String s = "First Java program in java";

        System.out.println("Frequency of each element in String");
        Map<Character,Long> occurance =  s.chars().mapToObj(c->(char)c).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        System.out.println(occurance);

        List<String> list = Arrays.asList("pen","bed","book","pen","phone","bed","eraser","phone","laptop");
        System.out.println("Frequency of each word in List of strings:");
        Map<String,Long> f1 = list.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        System.out.println(f1);

        System.out.println("*** Sorting list of string using stream ***");
        list.stream().sorted(Comparator.naturalOrder()).forEach(System.out::println);

        System.out.println(" ** **Sorting list of string using in descending order");
        list.stream().distinct().sorted(Comparator.reverseOrder()).forEach(System.out::println);

        System.out.println("JOin the string with prefix '[' and suffix ']' and this '/' ");
        String l1 = list.stream().distinct().collect(Collectors.joining(" /","[","]"));
        System.out.println(l1);
    }
}
