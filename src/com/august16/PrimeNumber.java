package com.august16;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        System.out.println("Enter any integer number ");
        int num = new Scanner(System.in).nextInt();
        boolean isPrime = true;
        if(num>0){
            for(int i=2;i<num;i++){
                if(num%i==0){
                    isPrime = false;
                    break;
                }
            }
        }
       else{
            System.out.println("Please enter value which is greater than 0");
            return;
        }
        if(isPrime ){
            System.out.println(num+" is Prime ");
        }
        else{
            System.out.println(num+" is not Prime ");

        }
    }
}
