package com.java8;

import java.util.Optional;

public class OptionalClassMethods {
    public static void main(String[] args) {

//        if we are passing null to the ofNullable() method then we don't get Nullpointerexception
//        we just have Optional class with empty
        Optional op1 = Optional.ofNullable(null);
        System.out.println(op1.isEmpty());
    }
}
