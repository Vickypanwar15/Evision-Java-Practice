package com.august16;

import java.util.Scanner;

public class SecondLargestNumber {

//     find second largest using sorting an array elments
    public static void findSecondLargestWithSorting(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                if (arr[i] < arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println("Second Largest Number:"+arr[1]);
    }
//        find second largest without sorting
        public static int findSecondLargest(int[] arr){
            int firstLarge=0;
            for (int k : arr) {
                if (firstLarge < k) {
                    firstLarge = k;
                }
            }
            int secondLarge =0;
            for (int j : arr) {
                if (j == firstLarge) {
                    continue;
                } else if (secondLarge < j) {
                    secondLarge = j;
                }
            }
            return secondLarge;
        }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int size = scanner.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter "+size+" element in array");
        for(int i =0;i<size;i++){
            arr[i] = scanner.nextInt();
        }
        System.out.println("Arrays Elements ");
        for (int element:arr){
            System.out.print(element+" ");
        }
        System.out.println();
//        first method calling
        System.out.println("Second Largest Number:"+findSecondLargest(arr));

//        Second method calling
//        findSecondLargestWithSorting(arr);
    }
}
