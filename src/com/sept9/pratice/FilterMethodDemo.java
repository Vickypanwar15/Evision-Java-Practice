package com.sept9.pratice;

import java.util.Arrays;
import java.util.stream.Stream;

public class FilterMethodDemo {

    public  static void filterByStartWith(){
        String[] myArray
                = new String[] { "stream",   "is",  "a",
                "sequence", "of",  "elements",
                "like",     "list" };
        System.out.println("******* String array values ********");
        for (String s : myArray){
            System.out.println(s);
        }

        System.out.println("---------Starts with 'S' ----------- " );
        Arrays.stream(myArray).filter(s -> s.startsWith("s")).forEach(System.out::println);
    }


    public  static void startwithVowel(){
        String[] str = {"Iran","ishan","avinash","bhavesh","chandu","orange","use",""};
        Arrays.stream(str).filter(s -> s.toLowerCase().matches("(a|e|i|o|u)\\w*")).forEach(System.out::println);

    }

    public static void main(String[] args) {
        filterByStartWith();
        System.out.println("String only start with vowel");
        startwithVowel();
    }
}
