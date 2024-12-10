package com.javastream;

import java.util.stream.Stream;

public class PrimitiveToStream {
    public static void main(String[] args) {
        int a = 232;
         Stream.of(a).forEach(System.out::println);
    }
}
