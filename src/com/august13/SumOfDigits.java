package com.august13;

import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number");
        int num = sc.nextInt();
        int sum=0;
        while (num>0){
            int r = num%10;
            sum=r*10+r;
            num/=10;
        }
        System.out.println("Sum of digits :"+sum);
    }
}
