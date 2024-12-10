package com.sept23;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FirstNonRepetedCharacter {
    public static void main(String[] args) {
        String str = "Java is programming language";
        System.out.println("First non repeated character in string");
        Character result = str.chars().mapToObj(s -> Character.toLowerCase(Character.valueOf((char) s)))
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
                .entrySet().stream().filter(entry -> entry.getValue() == 1l).map(entry -> entry.getKey()).findFirst().get();
        System.out.println(result);

        System.out.println("Find first repeated character in string");
        Character result1 = str.chars().mapToObj(s->Character.toLowerCase(Character.valueOf((char) s)))
                .collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new,Collectors.counting()))
                .entrySet().stream().filter(entry->entry.getValue() > 1).map(entry->entry.getKey()).findFirst().get();

        System.out.println(result1);
    }
}

