package com.arraymanipulation;

public class ArrayRotation {
//    public  static int[] rotateArraybyOne(int[] arr,int rotateValue){
//        int size = arr.length;
//        int[] arr1 = new int[size];
//        int count =0;
//        arr1[count] = arr[size-1];
//        for (int i=0;i<size-1;i++){
//            arr1[++count]=arr[i];
//        }
//        return arr1;
//    }

    public static int[] rotateByN(int[] arr,int n){
        int size = arr.length;
        int[] arr1 = new int[size];
        if(arr.length==n){
            return arr;
        }
        else{
            int count =0;
            for (int i = size-n;i<size;i++){
                arr1[count]= arr[i];
                count++;
            }
            for (int j=0;j<size-n;j++){
                arr1[count] = arr[j];
                count++;
            }
            return arr1;
        }
    }
    public static void main(String[] args) {
        int[] arr ={10,8,9,12,6};
        ArrayManipulation.printArrayElement(arr);
        arr = rotateByN(arr,1);
        System.out.println("Rotate By 1");
        ArrayManipulation.printArrayElement(arr);

        arr = rotateByN(arr,2);
        System.out.println("Rotate By 2");
        ArrayManipulation.printArrayElement(arr);

        arr = rotateByN(arr,2);
        System.out.println(" Again Rotate By 2");
        ArrayManipulation.printArrayElement(arr);

        System.out.println("Rotate By 1");
        arr = rotateByN(arr,1);
        ArrayManipulation.printArrayElement(arr);

        arr = rotateByN(arr,5);
        ArrayManipulation.printArrayElement(arr);
    }
}
