package com.sept9.pratice;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ImpMethodOfStreams {
    public static void main(String[] args) {
        List<String> cityname = Arrays.asList("Indore","Goa","Dewas","Depalpur","Nagda","Neemach");
//        if we create a list using Arrays.asList() method than we can' modify  that list or we can't add element
//        with add() method if we are trying to do that we get UnsupportedOperationException;
//        cityname.add("Avinash");


//        To print list elements
        System.out.println(cityname);

//        to filter the list print elements from the list which length is 5

        List<String> newList = cityname.stream().filter(list->list.length() ==5).collect(Collectors.toList());

//        to print new list which element length is exactly 5
        System.out.println(newList);

//        there is another way to filter the list and print the value using forEach let us see
//        in this we don't need to create a lis
        cityname.stream().filter(list->list.length()>=5).collect(Collectors.toList()).forEach(System.out::println);

        System.out.println("Count method of stream");
    }
}
