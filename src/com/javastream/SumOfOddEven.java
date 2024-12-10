package com.javastream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;

public class SumOfOddEven {
    public static void main(String[] args) {
        List<Integer> arr  = Arrays.asList(43,12,54,77,88,91,11,13,44);
        System.out.println(arr);
        Predicate<Integer> even = integer -> integer%2==0;
        Predicate<Integer> odd = integer -> integer%2!=0;
        System.out.println("Even Numbers are");
        arr.stream().filter(even).forEach(integer -> System.out.print(integer+" , "));
        int evenSum = arr.stream().filter(even).reduce(0,(integer, integer2) -> integer+integer2 );
        System.out.println();
        System.out.println("Even Number sum :"+evenSum);

        System.out.println("Odd Numbers are");
        arr.stream().filter(odd).forEach(integer -> System.out.print(integer+" , "));


        int oddSum = arr.stream().filter(odd).reduce(0,(i1,i2)->i1+i2);
        System.out.println("Odd Number Sum:"+oddSum);

//        find the maximum and minimum of value
        Optional<Integer>  min = arr.stream().min(Integer::compare);
        if(min.isPresent()){
            System.out.println("Minimum value :"+min.get());
        }
        Optional<Integer>  max = arr.stream().max(Integer::compare);
        if(min.isPresent()){
            System.out.println("Maximum value :"+max.get());
        }
        Optional<Integer> secondMin = arr.stream().distinct().skip(1).findFirst();
        System.out.println("Second Minimum value :"+secondMin.get());

        Optional<Integer> secondMax = arr.stream().sorted((a,b)->Integer.compare(b,a)).skip(1).findFirst();
        System.out.println("Second Maximum value :"+secondMax.get());


    }
}
