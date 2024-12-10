package com.collection.question;

import java.util.ArrayList;
import java.util.List;

public class CountSmallerNumberAfterSelf {

    public  static List<Integer> countSmaller(int[] nums){
        List<Integer> countSmallerNumber = new ArrayList<>();
        int size  = nums.length;
        for(int i=0;i<size;i++){
            int count =0;
            for (int j=i+1;j<size;j++){
                if(nums[i]>nums[j]){       // (5 > 2)       5>6 false  5>1
                    count++;                // count = 1                count=2
                }
            }
            countSmallerNumber.add(count);
        }
        return countSmallerNumber;
    }

    public static void main(String[] args) {
        int[] nums = {5,2,6,1};
        List<Integer> smallNumberCount = countSmaller(nums);
        System.out.println(smallNumberCount);
    }
}
