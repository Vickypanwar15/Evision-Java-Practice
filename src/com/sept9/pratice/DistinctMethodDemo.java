package com.sept9.pratice;

import java.util.*;
import java.util.stream.Stream;

public class DistinctMethodDemo {
    public static void main(String[] args) {
        List<Integer> arrlist = new ArrayList<>();
        arrlist.add(23);
        arrlist.add(43);
        arrlist.add(100);
        arrlist.add(23);
        arrlist.add(56);
        arrlist.add(100);
        arrlist.add(200);
        arrlist.add(321);
        arrlist.add(56);
        System.out.println("Integer list present ");
        System.out.println(arrlist);

        System.out.println("Distinct list present");
        arrlist.stream().distinct().forEach(i-> System.out.print(i+" "));

        List<String> strList = new ArrayList<>();
        strList.add("Vishal");
        strList.add("Avinash");
        strList.add("Rahul");
        strList.add("Abhishek");
        strList.add("Vishal");
        strList.add("Vijay");
        strList.add("Khusi");
        strList.add("Rahul");
        strList.add("Khusi");
        System.out.println("---String Array List");
        System.out.println(strList);

        System.out.println("-*--*Disinct String list -*--*--**");
        strList.stream().distinct().forEach(str-> System.out.print(str+" "));
        System.out.println();
        long num2 = strList.stream().distinct().count();
        System.out.println("Distict elemtn in list :"+num2);
        System.out.println(strList);

        System.out.println("*** * * * Map method use case *** * * *");
//        find the cube of all elements present in arraylist and print
        arrlist.stream().map(i->i*i*i).forEach(i->System.out.print(i+" , "));
        System.out.println();
        arrlist.stream().filter(i-> i*i*i < 200000).map(i->i*i*i).forEach(i->System.out.print(i+" , "));

        System.out.println();
        long num = strList.stream().count();
        System.out.println("Count :"+num);

        Optional<String> first = strList.stream().findFirst();
        if(first.isPresent()){
            System.out.println("First :"+first.get().toUpperCase());
        }

        String[] list2 = {"Vishal","Vaibhav","Vidhyathi","Vansh","Zerox"};
        boolean startwithV = Arrays.stream(list2).allMatch(s -> s.startsWith("V"));
        System.out.println("All String start with V :"+startwithV);
        boolean containZ = Arrays.stream(list2).anyMatch(s -> s.contains("Z"));
        System.out.println("Containe Z value :"+containZ);


        System.out.println("AnyMatch method in stream api ");
        System.out.println(strList.stream().anyMatch(s->s.startsWith("V")));
        System.out.println(strList.stream().allMatch(s->s.startsWith("V")));
//      merge two stream into a single
        Stream<String> concatStream = Stream.concat(strList.stream(),Arrays.stream(list2));
        concatStream.forEach(s->System.out.print(s+" , "));
        System.out.println("findAny and findFirst methods in stream API demonstrate");
        String s = null;
        Optional<String> first1 = Stream.ofNullable(s).findFirst();
        if(first1.isPresent()){
            System.out.println("First value is :"+first1.get());
        }
        else{
            System.out.println("Nothing is present in stream");
        }

        Optional<String> present = strList.stream().parallel().findAny();
        System.out.println(present.orElse("Not present"));
        System.out.println("Sorted string of natural sorting");
        strList.stream().sorted().forEach(s1->System.out.print(s1+" , "));
        System.out.println("Custom sorting order");
        List<String> compare = strList;
        compare.stream().sorted((s1,s2)->s2.compareTo(s1)).distinct().forEach(s1->System.out.print(s1+" , "));
    }
}
