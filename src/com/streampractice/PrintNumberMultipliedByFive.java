package com.streampractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PrintNumberMultipliedByFive {
    public static void main(String[] args) {
        List<Integer> lst = Arrays.asList(23,54,67,45,70,20,33,37,35,205,321,96,99);
        System.out.println("All elements present in list");
        System.out.println(lst);
        System.out.println("elements which is divisible by 5 ");
        lst.stream().filter(num->num%5==0).forEach(System.out::println);
    }
}
