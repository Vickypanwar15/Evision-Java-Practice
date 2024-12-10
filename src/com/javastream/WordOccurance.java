package com.javastream;

import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class WordOccurance {
    public static void main(String[] args) {
        String s = "vikrant group of institutions";
        Stream.of(s).forEach(WordOccurance::countWordOccurance);
    }

    public static void countWordOccurance(String s){
        Map<Character,Integer> map = new LinkedHashMap<>();
        for (int i=0;i<s.length();i++){
            int count=0;
            for (int j=0;j<s.length();j++){
                String s1 = String.valueOf(s.charAt(i));
                String s2 = String.valueOf(s.charAt(j));
                if(s1.equals(" ") || s2.equals(" ")){
                    continue;
                } else if (s1.equals(s2)) {
                    count++;
                }
                map.put(s.charAt(i),count);
            }
        }
        System.out.println(map);
    }
}
