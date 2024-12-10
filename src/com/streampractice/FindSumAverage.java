package com.streampractice;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.OptionalDouble;


public class FindSumAverage {
    public static void main(String[] args) {
        int[] list1 = {32,43,54,65,76,34,21,46,76};
        int sum = Arrays.stream(list1).sum();
        System.out.println(sum);
        OptionalDouble average = Arrays.stream(list1).average();
        if(average.isPresent()){
            System.out.println("Average :"+average.getAsDouble());
        }
        else{
            System.out.println("Value is not present");
        }

    }
}
