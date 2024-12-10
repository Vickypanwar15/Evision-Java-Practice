package com.august22array;

import java.util.Scanner;

public class SortArrayElement {

    public static void sortingInAscending(int[] arr){
        for (int i = 0;i<arr.length;i++){
            for (int j = i+1;j<arr.length;j++){
                if(arr[i]>arr[j]){
                    int temp = arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        System.out.println("Sorted array are :");
        for(int element : arr){
            System.out.print(element+" ");
        }
    }

    public static void sortingDescending(int[] arr){
        for(int i =0 ;i<arr.length;i++){
            for (int j =i+1;j< arr.length;j++){
                if(arr[i]<arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println("Array sorting in descending order");
        for(int e : arr){
            System.out.print(e+" ");
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[5];
        System.out.println("Enter 5 element in array");
        for (int i = 0 ;i< arr.length;i++){
            arr[i] = scanner.nextInt();
        }
        sortingInAscending(arr);
        System.out.println();
        sortingDescending(arr);
    }
}
