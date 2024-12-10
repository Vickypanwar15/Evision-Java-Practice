package com.august21;

import java.util.Scanner;

public class FindLengthWithoutMethod {
    public static void main(String[] args) {
        String str = new Scanner(System.in).nextLine();
       int count =0;
       for (char ch : str.toCharArray()){
           count++;
           System.out.println(ch);
       }
        System.out.println("Length of "+str + " is "+count);
    }
}
