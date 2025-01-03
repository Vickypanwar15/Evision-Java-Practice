package com.streampractice;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class DecimalSorting {
    public static void main(String[] args) {
        List<Double> d = Arrays.asList(12.45, 23.58, 17.13, 42.89, 33.78, 71.85, 56.98, 21.12);
        System.out.println(d);
        List<Double> reverseOrder  = d.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        System.out.println(reverseOrder);
    }
}
