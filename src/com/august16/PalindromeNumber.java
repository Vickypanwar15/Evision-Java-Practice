package com.august16;

import java.util.Scanner;

public class PalindromeNumber {
    public static void main(String[] args) {
        int num = new Scanner(System.in).nextInt();
        if(num <=0){
            System.out.println("Enter any non zero integer value");
            return;
        }
        int reverse=0;
        int temp = num;
        while(num>0){
            int remainder = num%10;//1 // 2
            reverse = reverse * 10 + remainder;
            num = num/10;
        }
        if(reverse==temp){
            System.out.println("Number is Palindrome");
        }
        else{
            System.out.println("Number is not Palindrome");
        }

    }
}
