package com.nestedclass;

import java.lang.reflect.Method;
import java.util.*;
import java.util.stream.Collectors;

public class ClassDemo {
    static  int count =0;
    public static void main(String[] args) {
        Class<?> c = Map.class;
        System.out.println("Name :"+c.getName());
        System.out.println("Simple Name:"+c.getSimpleName());
        System.out.println("Interfaces:"+ Arrays.toString(c.getInterfaces()));
        System.out.println("Super class Name :"+c.getSuperclass());
        System.out.println("Methods present in ArrayList:");
        Method[] m = c.getMethods();
       Arrays.stream(m).sorted(Comparator.comparing(Method::getName)).forEach(m1->{
           System.out.println(++count+") "+m1.getName());
       });
    }
}
