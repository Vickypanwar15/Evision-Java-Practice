package com.streampractice;

import java.util.Arrays;
import java.util.List;
public class CommonElementsTwoArray {
    public static void main(String[] args) {
        List<Integer> arr1 = Arrays.asList(23,21,10,9,5,6);
        List<Integer> arr2 = Arrays.asList(10,16,2,7,5,20,23);

        arr1.stream().filter(arr2::contains).forEach(System.out::println);
    }
}
