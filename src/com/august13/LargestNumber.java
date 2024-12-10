package com.august13;

import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {
        System.out.println("Enter three numbers ");
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        int ans = ((a>b) && (a>c))?a:(b>c) && (b>a)?b:c;
        System.out.println("Largest Number:"+ans);
    }
}
