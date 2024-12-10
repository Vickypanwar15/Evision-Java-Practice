package com.august13;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two integer numbers");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        System.out.println("For Addition Enter + ");
        System.out.println("For Subtraction Enter - ");
        System.out.println("For Multiplication Enter * ");
        System.out.println("For Division Enter / ");
        String ch = sc.next();
        switch (ch){
            case "+":
                System.out.println("Addition:"+(num1+num2));
                break;
            case "-":
                System.out.println("Subtraction:"+(num1-num2));
                break;
            case "*":
                System.out.println("Multiplication:"+(num1*num2));
                break;
            case "/":
                System.out.println("Division:"+(num1/num2));
                break;
            default:
                System.out.println("Invalid operation");
                break;
        }


    }
}
