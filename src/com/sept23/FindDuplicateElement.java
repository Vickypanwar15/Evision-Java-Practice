package com.sept23;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindDuplicateElement {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(10,15,8,49,25,98,98,32,15);
        HashSet<Integer> set = new HashSet<>();
        list.stream().filter(n->!set.add(n)).forEach(System.out::println);

        list.stream().findFirst().stream().forEach(System.out::println);
        long count = list.stream().count();
        System.out.println("Total element :"+count);
    }
}
