package com.javastream;

import java.util.stream.Stream;

public class ConcatMethodStream {
    public static void main(String[] args) {
        Stream<Integer> s = Stream.of(23,43,23,54,65,43,345,653);
        Stream<String> s1 = Stream.of("Vishal","Aakash","Avinash","Rahul","Sumit");
        Stream merge = Stream.concat(s,s1);
        merge.forEach(System.out::println);
    }
}
