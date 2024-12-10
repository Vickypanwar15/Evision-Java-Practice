package com.august13;

public class SwapNumbersWithXor {
    public static void main(String[] args) {
        int a = 3;
        int b = 4;
        System.out.println("Before swapping");
        System.out.println("A="+a);
        System.out.println("B="+b);
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;

        System.out.println("After swapping");

        System.out.println("A="+a);
        System.out.println("B="+b);
    }
}
