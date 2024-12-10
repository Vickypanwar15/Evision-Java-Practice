package com.streampractice;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ThreeMaximumAndMinimum {
    public static void main(String[] args) {
        int[] arr1 = {2,4,1,6,5};
        int[] arr2 = {1,7,2,9,0};

        System.out.println("Merge arrays ");
        int[] arr3 = IntStream.concat(Arrays.stream(arr1),Arrays.stream(arr2)).distinct().toArray();
        for (Integer a:arr3){
            System.out.print(a+" ");
        }
        System.out.println();
        System.out.println("Find 3 minimum numbers from array using stream");
        Arrays.stream(arr3).sorted().limit(3).forEach(System.out::println);

        System.out.println("Three maximum number from array using stream");
//        using stream.of(int[]) it creates the Intstream that is not implement comparator interface
//        that's why we cant use sorted method in reverseOrder()
//        Arrays.stream(arr3).sorted(Comparator.reverseOrder()).limit(3).forEach(System.out::println);


//        boxed method is used to do auto conversion to primitive int[] arr to Stream<Integer>
        Arrays.stream(arr3).boxed().sorted(Comparator.reverseOrder()).limit(3).forEach(System.out::println);

    }
}
