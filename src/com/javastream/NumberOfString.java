package com.javastream;

import java.util.ArrayList;
import java.util.List;

public class NumberOfString {
    public static void main(String[] args) {
        List<String> str = new ArrayList<>();
        str.add("Avinash");
        str.add("Vikas");
        str.add("Vishal");
        str.add("Ganesh");
        str.add("Aakash");
        str.add("Aashish");
        str.add("Vaibhav");

        System.out.println("The number of string which start with 'A' ");
       long a = str.stream().filter(str1->str1.startsWith("A")).count();
        System.out.println(a);
    }
}
