package com.sept23;

import java.util.Arrays;
import java.util.List;

public class CubeOfElement {
    public static void main(String[] args) {
        List<Integer> arr = Arrays.asList(4,5,6,7,1,2,3);
        arr.stream().map(i->i*i*i).filter(num -> num>50 ).forEach(System.out::println);
    }
}
