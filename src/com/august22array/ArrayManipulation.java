package com.august22array;

import java.util.Scanner;

public class ArrayManipulation {

//    Method-1 To take input from user and store in integer array
    public static int[] takeInput(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter how many element you wan to store in array");
        int size = scanner.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter "+size+" element in array");
        for (int i=0;i<size;i++){
            arr[i] = scanner.nextInt();
        }
        return arr;
    }

//    Method:2 to print the array elements it takes array as input
    public static void printArrayElement(int[] arr){
        if(arr.length==0){
            System.out.println("Array is empty");
            return;
        }

        for (int i=0;i<arr.length;i++){
            if(i==arr.length-1){
                System.out.print(arr[i]);
            }
            else{
                System.out.print(arr[i]+" , ");
            }
        }
        System.out.println();
    }

//    Method:3 it is used to add element at the specific index it takes three input int[] ar,index and value
    public static int[] addElementAtIndex(int[] arr,int index,int value){
        int size = arr.length;
     int[] editArray = new int[size+1];
     int j=0;
        if (index < 0 || index > size) {
            System.out.println("Invalid index: " + index);
            return arr;
        }
     for (int i=0;i<editArray.length;i++){
         if(i==index){
             editArray[i]=value;
         }
         else{
             editArray[i]=arr[j];
             j++;
         }
     }
     return editArray;
    }

// Method:4   In this method we pass integer array and value which you want to add into the array at last index
    public static int[] addElementAtLast(int[] arr,int value){
        int size =arr.length;
        int[] editArray = new int[size+1];
        int j=0;
        for (int i=0;i<editArray.length;i++){
            if(size==i){
                editArray[i]=value;
            }
            else {
                editArray[i] = arr[j];
                j++;
            }
        }
        return editArray;
    }

// Method:5    To remove element from array just pass the array and value which you want to remove from array
    public static int[] removeElement(int[] arr,int value){
        boolean isfound =false;
        for (int element:arr){
            if(element==value){
                isfound=true;
                break;
            }

        }
        if (isfound){
            int[] editArray = new int[arr.length-1];
            int j=0;
            for (int i=0;i<arr.length;i++){
                if(arr[i]==value){
                    continue;
                }
                else {
                    editArray[j]=arr[i];
                    j++;
                }
            }
            return editArray;
        }
       return arr;
    }


    public static void main(String[] args) {
        int[] arr =takeInput();
        printArrayElement(arr);
        arr = addElementAtIndex(arr,3,1000000);

        System.out.println("Updated Array Element are ");
        printArrayElement(arr);

        arr =  addElementAtIndex(arr,5,1038);
        printArrayElement(arr);

        arr = addElementAtLast(arr,5555);
        printArrayElement(arr);

        arr = addElementAtIndex(arr,0,32434);
        printArrayElement(arr);

        arr = removeElement(arr,1000000);
        printArrayElement(arr);

    }
}
