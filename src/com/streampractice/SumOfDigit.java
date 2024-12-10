package com.streampractice;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SumOfDigit {
    public static void main(String[] args) {
        int num =1025;
        int sumdigit = Arrays.stream(String.valueOf(num).split("")).mapToInt(Integer::parseInt).sum();
        System.out.println(sumdigit);
    }
}
