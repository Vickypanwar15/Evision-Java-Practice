package com.august13;

import java.util.Scanner;

public class NumberisEvenorOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();  // 13
        boolean isEven = (num & 1) ==0;   // 00001101 & 00000001 ==> 1 == 0 false 13 is odd
        // 14 & 1   00001110 & 00000001 ==> 0 == 0 true 14 is even
        if(isEven)
            System.out.println(num+ " is even");
        else
            System.out.println(num+ " is odd");

    }
}
