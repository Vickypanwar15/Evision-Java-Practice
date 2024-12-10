package com.august16;

import java.util.ArrayList;
import java.util.Scanner;

public class SumOfOddEven {
    public static void main(String[] args) {
        int num = new Scanner(System.in).nextInt();
        ArrayList<Integer> lst = new ArrayList<Integer>();
        while (num>0){
            int remainder = num%10;
            lst.add(remainder);
            num=num/10;
        }
        int oddSum=0;
        int evenSum=0;
       for(Integer i : lst){
          if(i%2==0){
              evenSum+=i;
          }
          else{
              oddSum+=i;
          }
       }
        System.out.println("Even Number sum :"+evenSum);
        System.out.println("Odd Number Sum :"+oddSum);
    }
}
