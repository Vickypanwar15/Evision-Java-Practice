package com.java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class DeclareStreams {
    public static void main(String[] args) {

//        to convert list to the stream with asList() method
        List<String> name = Arrays.asList("Vishal","Bhupesh","Rahul");
       name.stream().forEach(System.out::println);

        System.out.println("city names present in array");
       String[] cityName = {"Indore","Bhopal","Ujjain","Dewas"};
        Arrays.stream(cityName).forEach(System.out::println);

//        create a stream from values directly
        Stream<String> subject = Stream.of("Talaash","Jaadu","KGF","RRR");
        subject.forEach(System.out::println);
    }
}
