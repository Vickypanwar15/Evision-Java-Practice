package com.august22array;

import java.util.Scanner;

public class ArrayIntializer {
    public int[] intializeArray(){
        System.out.println("Enter size of array");
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        int[] arr = new int[size];
        for (int i =0;i<size;i++){
            arr[i] = scan.nextInt();
        }
        return  arr;
    }
}
