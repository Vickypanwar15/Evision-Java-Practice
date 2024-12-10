package com.august26setmap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class SecondHighestNumber {
    public static void main(String[] args) {
        List<Integer> lst = Arrays.asList(23,45,43,21,45,76,87,54,22,12,65);
        System.out.println(lst);
        lst.stream().sorted().forEach(System.out::println);
        int firstNum = lst.stream().max(Comparator.comparingInt(Integer::intValue)).get();
        int secondNum = lst.stream().filter(num->num!=firstNum)
                .max(Comparator.comparing(Integer::intValue)).get();

        /*
        sorted of list using stream : 12 21 22 23 43 45 45 54 65 76 87
        firstNum = 87
        filter(12!=87)  true =  max = 87
        filter(21!=87)   true , max = 87
        filter(22!=87)  true =  max = 87
        filter(23!=87)   true , max = 87
        filter(43!=87)  true =  max = 87
        filter(45!=87)   true , max = 87
        filter(45!=87)  true =  max = 87
        filter(54!=87)   true , max = 87
         filter(65!=87)   true , max = 87
        filter(76!=87)  true =  max = 87
        filter(87!=87)   false , max = 76
         */
        System.out.println("First Highest :"+firstNum);
        System.out.println("Second Highest :"+secondNum);
    }
}
