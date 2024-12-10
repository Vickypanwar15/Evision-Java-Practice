package com.august16;

import java.util.Scanner;

public class FibbonacciSeries {
    public static void printSeries(int n){
        int num1=0;
        int num2=1;
        if(n>2){
            System.out.print(num1+" "+num2);
            for(int i=2;i<n;i++){
                int num3 = num1+num2;
                System.out.print(" "+num3);
                num1=num2;
                num2=num3;
            }
        }
        else if(n==1){
            System.out.println(num1);
        }
        else if(n==2){
            System.out.print(num1+" "+num2);
        }
        else{
            System.out.println("number is equal to or less than 0 enter number which is greater than 0");
        }

    }
    public static void main(String[] args) {
        System.out.println("Enter the series number Ex - 4,5,7,10 etc");
        int n = new Scanner(System.in).nextInt();
       printSeries(n);
    }
}
