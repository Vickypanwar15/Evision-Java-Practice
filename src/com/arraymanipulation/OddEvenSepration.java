package com.arraymanipulation;

public class OddEvenSepration{


    public static void main(String[] args){
        int[] arr = {1,3,4,5,7,8,10,12,9};
        int count =0;
        int size = arr.length-1;
        for(int i=0;i<arr.length;i++) {

            if(arr[i]%2!=0){
                int temp = arr[i];
                arr[i] = arr[size];
                arr[size] = temp;
            }
        }
//
        for(int p =0;p<arr.length;p++){
            System.out.print(arr[p]+" ");
        }

    }
}
