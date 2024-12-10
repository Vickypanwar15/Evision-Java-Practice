package com.streampractice;

import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FrequencyOfEachElement {
    public static void main(String[] args) {
        List<Integer> l = Arrays.asList(34,54,65,34,56,76,54,65,45,53,34,76,100);
        System.out.println(l);
        l.stream().distinct().forEach(System.out::println);

       Map<Integer, Long> frequency = l.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        System.out.println(frequency);

    }
}
