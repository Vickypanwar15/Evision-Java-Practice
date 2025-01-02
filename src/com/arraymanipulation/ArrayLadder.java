package com.arraymanipulation;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class ArrayLadder {

    public static int findMax(int[] arr,int startIndex){ // 16 17 4 3 5 2
        int max = Integer.MIN_VALUE;
        int size = arr.length;
        int index=-1;
        for(int i=startIndex;i<size;i++){
            for(int j=i+1;j<size;j++){
                if(max<=arr[j]){
                    max = arr[j];
                  index = i;
                }
            }
        }
        return index;
    }

    public static void main(String[] args) {

//        int[] arr = {16,17,4,3,5,2};
//        int[] arr = {0,-1,-10,0,0};
        int[] arr = {61,61,17};
        List<Integer> a = new ArrayList<>();

        int index = findMax(arr,0);

        for (int i=0;i<index;i++) {
            if(index!=-1)
            a.add(arr[index]);
            index = findMax(arr, index);
        }
        System.out.println(a);

    }
}
