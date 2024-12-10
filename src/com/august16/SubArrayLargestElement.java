package com.august16;

public class SubArrayLargestElement {
    public static void main(String[] args) {
        int[] arr = {2,4,5,3,6,7,9,4,5,6};
        int firstNum=0;
        int secondNum=0;
        for(int i=2;i<=6;i++){
            if(firstNum<arr[i]){
                firstNum=arr[i];
            }
        }
        System.out.println(firstNum);
        for(int i=2;i<=6;i++){
            if(arr[i]==firstNum){
                continue;
            }
            else if(secondNum<arr[i]){
                secondNum=arr[i];
            }
            else{

            }
        }
        System.out.println("Second largst Subarray element is :"+secondNum);
    }
}
