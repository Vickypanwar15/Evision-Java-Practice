package com.javastream;
import java.util.Arrays;
import java.util.List;
public class StreamOnString {
    public static void main(String[] args) {
        List<String> name = Arrays.asList("ravi", "vicky", "vishal", "Nikhilesh", "Man", "Harsh", "Chirag", "Shiva");

        System.out.println(name);

        name.stream().filter(s -> s.length() == 5).map(String::toUpperCase).toList().forEach(System.out::println);

        name.stream().filter(s -> s.length() > 6).map(String::toUpperCase).toList().forEach(System.out::println);
    }
}

