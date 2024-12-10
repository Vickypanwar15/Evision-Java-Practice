package com.august16;

import java.util.Scanner;

public class StringPalindrom {
    public static void main(String[] args) {
        String s = new Scanner(System.in).nextLine();
        System.out.println(s);
        char[] arr = new char[s.length()];
        int count=0;
        for(int i = s.length()-1;i>=0;i--){
            arr[count] = s.charAt(i);
           count++;
        }
        String s2 = new String(arr);
        if(s.equalsIgnoreCase(s2)){
            System.out.println("String is palindrome");
        }
        else{
            System.out.println("String is not palindrome");
        }
    }
}
