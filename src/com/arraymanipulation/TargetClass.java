package com.arraymanipulation;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;

public class TargetClass {

    public static boolean targetSum(int[] arr,int target) {
        boolean istarget=false;
//        for (int i = 0; i < arr.length; i++) {
//            int sum = 0;
//            for (int j = i + 1; j < arr.length; j++) {
//                sum = arr[i] + arr[j];
//                if (sum == target) {
//                    istarget = true;
//                    return istarget;
//                }
//            }
//        }
//        return istarget;

        // Create a HashMap to store numbers and their indices
        LinkedHashMap<Integer, Integer> map = new LinkedHashMap<>();

        for (int i = 0; i < arr.length; i++) {
            // Calculate the complement
            int complement = target - arr[i];

            // Check if the complement exists in the map
            if (map.containsKey(complement)) {
                return true; // Pair found
            }

            // Store the current number in the map
            map.put(arr[i], i);
            System.out.println(map);
        }

        return false;
    }

//    with n2 time complexity
    public static int countTargetSumPairs(int[] arr,int target){
        int count=0;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]+arr[j]==target)
                    count++;
            }
        }
        return count;
    }

//    with n time complexity

    public static int lessTimeCountPair(int[] arr,int targetSum){
        int count=0;
        HashSet<Integer> h = new HashSet<>();
        for(int i=arr.length-1;i>=0;i--){
            int comp = targetSum - arr[i];
            if(h.contains(comp)){
                count++;
            }
            h.add(arr[i]);
        }
        return count;
    }

    public static void main(String[] args) {
        int[] arr = {1, 4, 45, 6, 10, 8};
//        int[] arr ={1, 2, 4, 3, 6};
//        int target = 16;
//        System.out.println(targetSum(arr,target));
//        System.out.println("------------------------------")


        int targetArray[] = {5,6,5,7,7,8};
                System.out.println(countTargetSumPairs(targetArray,13));


        System.out.println("----------------------------");
        System.out.println(lessTimeCountPair(targetArray,13));

    }
}
