package com.javastream;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectEvenNumber {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        for(int i=1;i<20;i++){
            list.add(i);
        }
        System.out.println("All element present in list");
        System.out.println(list);
//        collect() methods of stream interface to print the value with our requirment

//        1st way
        List<Integer> result =list.stream().filter(i->i%3==0 && i%2==0).collect(Collectors.toList());

//        2nd way
        Predicate<Integer> p = i->i%4==0 && i%7==0;

        Function<Integer,String> f1 = i-> i+"ACS";
        List<Integer> second = list.stream().filter(p).toList();
        System.out.println("element divible by 3 AND 2 list");
        System.out.println(result);
        System.out.println("-------------");
        System.out.println(second);
        Stream s1 = list.stream();
        Stream s2 = s1.map(f1);
        Iterator itr = s2.iterator();
        while (itr.hasNext()){
            System.out.print(itr.next()+" , ");
        }
    }
}
