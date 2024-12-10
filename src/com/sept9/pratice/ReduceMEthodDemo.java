package com.sept9.pratice;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ReduceMEthodDemo {
    public static void main(String[] args) {
        List<Integer> arrList = new ArrayList<>();
        arrList.add(1);
        arrList.add(8);
        arrList.add(3);
        arrList.add(2);
        arrList.add(5);
        arrList.add(4);

//        to print even number from list withour reduce method
        arrList.stream().filter(i->i%2==0).collect(Collectors.toList()).forEach(System.out::println);

//        to use reduce methods
        Integer i = arrList.stream().reduce(0,Integer::sum);
        System.out.println("Sum of array List:"+i);

        Integer max = arrList.stream().reduce(Integer.MIN_VALUE,Integer::max);
        Integer min = arrList.stream().reduce(Integer.MAX_VALUE,Integer::min);
        System.out.println("Maximim :"+max);
        System.out.println("Minimum :"+min);

        int product = arrList.stream().reduce(1,(a,b)->a*b);
        System.out.println("Product of all element:"+product);

    }
}
