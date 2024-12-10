package com.august22array;

public class FindDuplicateValue {

    public static void main(String[] args) {
        ArrayIntializer a = new ArrayIntializer();
        int[] arr = a.intializeArray();
        int[] duplicate= new int[5];
        int count =0;
        for (int i =0;i<arr.length;i++){
            for (int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    duplicate[count++] = arr[i];
                }
            }
        }
        System.out.println("Duplicates value present in array ");
        for(int i =0;i<count; i++){
            System.out.print(duplicate[i]+" ");
        }
    }
}
