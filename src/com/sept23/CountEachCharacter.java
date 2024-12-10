package com.sept23;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CountEachCharacter {
    public static void main(String[] args) {
        String str = "String data to count each character";
       Map<String,Long> m = Arrays.stream(str.split("")).map(String::toLowerCase).collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new,Collectors.counting()));

       for (Map.Entry<String,Long> m1 : m.entrySet()){
           System.out.println(m1.getKey()+"---->"+m1.getValue());
       }
    }
}
