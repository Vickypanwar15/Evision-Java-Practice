package com.august13;

import java.util.Scanner;

public class CountSetOfbits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int per = num;
        int count=0;
        while(num !=0){
            num = num & (num-1);  // 11 & 10 ==> 10 count = 1 , 10 & 9 ==> 8  count = 2,  8 & 7 ==> 0 count =3
            count++;
        }
        System.out.println("Number of 1's in "+per+ " is "+count);
    }
}
