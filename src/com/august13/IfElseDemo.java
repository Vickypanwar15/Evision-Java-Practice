package com.august13;

import java.util.Scanner;

public class IfElseDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int day = sc.nextInt();

        if(day<30){
            System.out.println("Short Period");
        }
        else if (day<=60) {
            System.out.println("Medium Period");
        }
        else {
            System.out.println("Long Period");
        }

        if(day%7==0){
            System.out.println("The Period is multiple of 7");
        }
        else {
            System.out.println("The Period is  not a multiple of 7");

        }
    }
}
