package com.sept9.pratice;

import java.util.Collection;
import java.util.Collections;
import java.util.Optional;
import java.util.function.Consumer;

public class OptionalDemo {

    public static  Optional<String> showMsg(){
        String s = null;
       Optional<String> o = Optional.ofNullable(s);
       return o;
    }

    public static void main(String[] args) {
        String[] str = new String[5];
        str[2] = "This is the Optional Class Example";
        str[4] = "ABC";
        Optional<String> obj1 = Optional.ofNullable(str[2]);
        if(obj1.isPresent()){
            System.out.println(obj1.get().toUpperCase());
        }
        else{
            System.out.println("Value is not present");
        }

        Optional<String> obj2 = Optional.of(str[4]);
        if(obj2.isPresent()){
            System.out.println(obj2.get());
        }
        else{
            System.out.println("Value is not present");
        }

        Consumer<String> findLength = s -> {
            Optional<String> o1 = Optional.of(s);
            if(o1.isPresent()){
                System.out.println(o1.get().length());
            }
        };
        System.out.print("Length of the string :");
        obj2.ifPresent(findLength);

//        Optional obj3 = Optional.of(str[2]);
        Optional<String> obj3 = Optional.empty();
        String value = obj3.orElse("Another content");
        System.out.println(value);
        obj3.ifPresent(findLength);  // if optional class is empty then  do nothing

        String str2 ="";
        Optional obj4 = Optional.of(str2);
        if(obj4.isPresent()){
            System.out.println("Value is :"+obj4.get());
        }
        else{
            System.out.println("Value is not present");
        }
        Optional<String> obj5 = showMsg();
        String value1 = obj5.orElse("Defualt Present");
        System.out.println("Value is :"+value1);

        System.out.println("if present method");
        Optional<String> obj6 = Optional.of("Anudip Foundation");
        obj6.ifPresent(s -> System.out.println(s.length()));
    }
}
