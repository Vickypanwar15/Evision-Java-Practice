package com.preparation;

import java.util.*;

public class ArrayListDemo {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(233);
        numbers.add(321);
        numbers.add(432);
        numbers.add(211);
        numbers.add(354);
        numbers.add(345);
        numbers.add(543);

        numbers.stream().sorted(Comparator.naturalOrder()).forEach(System.out::println);

        List<String> strings = Arrays.asList("Vishal","Bhavesh","Zerox","Ratlam","Omkar");
        strings.stream().sorted(Comparator.naturalOrder());
        Iterator<Integer> itr = numbers.iterator();
        while (itr.hasNext()){
          int num = itr.next();
          if(num > 500){
              itr.remove();
          }
          else {
              System.out.print(num+", ");
          }
        }

        Collections.sort(numbers);
        System.out.println();
        System.out.println("Sorted list");
        System.out.println(numbers);
        System.out.println("-------------------------------");

    }
}
