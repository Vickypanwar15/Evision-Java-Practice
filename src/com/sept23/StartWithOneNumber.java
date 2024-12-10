package com.sept23;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StartWithOneNumber {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(34,10,23,13,43,17,19,31,32);
        list.stream().map(s->s+"").filter(s->s.startsWith("1")).forEach(System.out::println);
    }
}
