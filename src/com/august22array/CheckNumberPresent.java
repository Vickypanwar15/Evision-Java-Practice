package com.august22array;

import java.util.Scanner;

public class CheckNumberPresent {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[5];
        System.out.println("Enter 5 element in array");
        for(int i =0;i<arr.length;i++){
            arr[i] = scanner.nextInt();
        }
        System.out.println("Enter any number");
        int num = scanner.nextInt();

        for (int  i =0;i<arr.length;i++){
            if(arr[i]==num){
                System.out.println(num + " is present in array at index "+i);
                return;
            }
        }
        System.out.println(num + " is not present ");
    }
}
