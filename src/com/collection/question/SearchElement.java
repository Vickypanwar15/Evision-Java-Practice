package com.collection.question;

import java.util.ArrayList;
import java.util.Scanner;

public class SearchElement {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<Integer>();
        for (int i = 2 ; i<=50; i =i+2){
            arr.add(i);
        }
        System.out.println(arr);
        System.out.println("Enter the element to find in array list");
        int num = new Scanner(System.in).nextInt();
        for (Integer i : arr){
            if(num==i){
                System.out.println(i+ " present at "+arr.indexOf(i));
                break;
            }
            else {
                System.out.println(num+ " is not present");
                return;
            }
        }
    }
}
