package com.javastream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Optional;

public class OptionalClassMethod {
    public static void main(String[] args) {

//        if we pass null to the of() method then we get NullPointerException
//        Optional o1 = Optional.of(null);
//        System.out.println(o1.get());
        int[] arr = {34,65,78,98};
//        we can't directly converted primitive type array to optional class
//        we use different way to convert it let's see
//        Optional<Integer> op = Optional.of(arr);
          Optional<Integer>[] op1 = Arrays.stream(arr).boxed().map(Optional::of).toArray(Optional[]::new);

//          NOTE : if we are work on the optional array then we can't directly work on the optional class method
//        there is different way to work with optional class that is shown in below
          Arrays.stream(op1).forEach(System.out::println);

        System.out.println("Divisble by 13 element from optional class");
          Arrays.stream(op1).map(opt ->opt.get()).filter(num ->num%13==0).forEach(System.out::println);

          String[] str = {"Ganesh","Shiv","Arjun","Bhim","Nakul"};
          Optional<String>[] strname= Arrays.stream(str).map(str1->Optional.of(str1)).toArray(Optional[]::new);

        System.out.println("String array conversion to Optional class");
        Arrays.stream(strname).map(opt1->opt1.get()).forEach(System.out::println);

        String comp = "Evision Software Solutions";
        Optional<String> value = Optional.ofNullable(comp);
        if(value.isPresent()){
            System.out.println(value.get());
        }
    }
}
