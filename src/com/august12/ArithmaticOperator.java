package com.august12;

import java.util.Scanner;

public class ArithmaticOperator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number");
        int num1 = sc.nextInt();
        System.out.println("Enter first number");
        int num2 = sc.nextInt();
        System.out.println("Addition:"+(num1+num2));
        System.out.println("Difference:"+(num1-num2));
        System.out.println("Multiplication:"+(num1*num2));
        System.out.println("Division:"+(num1/num2));
        System.out.println("Modules:"+(num1%num2));
    }

}
