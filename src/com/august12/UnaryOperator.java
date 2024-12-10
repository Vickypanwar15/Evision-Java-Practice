package com.august12;

public class UnaryOperator {
    public static void main(String[] args) {
        int a = 15;
        int b=38;
        System.out.println(a++); //15
        System.out.println(a);  //16
        System.out.println(--b); //37
        System.out.println(b--); //37
        System.out.println(b);  //36

        System.out.println(--a + b++); //15 + 36 == 51

        System.out.println(b);  // b = 37

        System.out.println(--a + b++ - ++b);
    }
}
