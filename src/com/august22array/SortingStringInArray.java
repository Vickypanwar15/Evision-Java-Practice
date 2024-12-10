package com.august22array;

import java.util.Arrays;
import java.util.Scanner;

public class SortingStringInArray {
    public static void main(String[] args) {
        String[] str = new String[5];
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < str.length; i++) {
            str[i] = scan.nextLine();
        }
//sorting using predefined method present in Arrays class
        Arrays.sort(str);
        for (String s1 : str) {
            System.out.print(s1 + " ");
        }

        for(int i =0;i< str.length;i++){
            for(int j =i+1;j<str.length;j++){
                if(str[i].compareToIgnoreCase(str[j])>0){
                    String temp = str[i];
                    str[i]=str[j];
                    str[j]=temp;
                }
            }
        }
        System.out.println();
        System.out.println("Sorting without sort method");
        for (String s1 : str) {
            System.out.print(s1 + " ");
        }

    }
}