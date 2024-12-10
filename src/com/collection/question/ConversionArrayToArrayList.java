package com.collection.question;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ConversionArrayToArrayList {
    public static void main(String[] args) {
        Integer[] arr = {34,54,3,65,76,23};
//        1st way to convert array to arraylist
        List<Integer> list = Arrays.asList(arr);
        System.out.println(list);
        int[] arr2 = {10,43,20,65,30,78,40};
        ArrayList<Integer> list2 = new ArrayList<Integer>();
//        2nd way to convert array to arraylist

        for (int i =0;i<arr2.length;i++){
            list2.add(arr2[i]);
        }
        System.out.println(list2);

//        3rd way to using java-8 feature that in stream to convert array to araraylist

//        boxed() method internally convert int[] to Integer[]
        List<Integer> list3 = IntStream.of(arr2).boxed().collect(Collectors.toList());
        System.out.println("Another arraylist :"+list3);



    }
}
