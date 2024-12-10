package com.customexception;

import java.util.Scanner;

public class ExceptionDemo extends Exception{
    public static void main(String[] args) {
        int num1 = new Scanner(System.in).nextInt();
        int num2 = new Scanner(System.in).nextInt();
        System.out.println(num1/num2);
    }
}
