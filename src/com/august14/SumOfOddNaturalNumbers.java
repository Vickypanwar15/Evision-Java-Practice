package com.august14;

import java.util.Scanner;

public class SumOfOddNaturalNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int sum =0;
        if(n>0){
            for(int i = 1;i<=n;i++){
                if(i%2!=0){
                    sum+=i;
                }
            }
        }
        else{
            System.out.println("Please check number is greater than zero");
            return;
        }

        System.out.println("Sum of odd numbers :"+sum);
    }
}
