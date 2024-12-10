package com.sept9.pratice;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerDemo {
    public static void main(String[] args) {
        List<String> cityNames = new ArrayList<>();
        cityNames.add("Indore");
        cityNames.add("goa");
        cityNames.add("ujjain");
        cityNames.add("dewas");
        cityNames.add("mumbai");
        cityNames.add("Mhow");
        System.out.println("Normal List elements:");
        System.out.println(cityNames);
        Consumer<List<String>> upper = list ->{
            for (int i =0;i<list.size();i++){
               list.set(i, cityNames.get(i).toUpperCase());
            }
            System.out.println();
        };

        upper.accept(cityNames);

        Consumer<List<String>> findLength = list->{
            for (int i =0;i<list.size();i++){
                System.out.println(list.get(i)+" : "+list.get(i).length());
            }
        };
        findLength.accept(cityNames);

    }
}
