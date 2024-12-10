package com.sept23;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class FindValue {
    public static void main(String[] args) {
        List<Integer> lst = Arrays.asList(32,45,65,50,21,50,43,23,50);
        Optional o1 = lst.stream().filter(n->n==50).findFirst();
        System.out.println(o1.get());
    }
}
