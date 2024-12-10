package com.sept23;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class LongestString {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Mahadev","Parth","GangeshwarMahadev","Kedarnath","Omkareshwar","MahakalRaja");
        Optional<String> value = list.stream().reduce((word1, word2)->word1.length() > word2.length() ? word1 : word2);
        System.out.println(value.get());
    }
}
