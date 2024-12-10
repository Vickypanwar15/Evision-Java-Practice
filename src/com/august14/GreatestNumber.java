package com.august14;

import java.util.Scanner;

public class GreatestNumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first value");
        int a = sc.nextInt();
        System.out.println("Enter Second value");
        int b = sc.nextInt();
        System.out.println("Enter Third value");
        int c = sc.nextInt();

//        ternary operators
        int max = (a>b)&&(a>c)?a:(b>a)&&(b>c)?b:c;
        System.out.println("Greatest Numbers is "+max);

    }
}
