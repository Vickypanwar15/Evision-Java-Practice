package com.august14;

import java.util.Scanner;

public class StartPattern {
    public static void main(String[] args) {
        System.out.println("Enter row number");
        int rows = new Scanner(System.in).nextInt();
        for(int i =1;i<=rows;i++){
            for(int space = i;space>=1;space--){
                System.out.print(" ");
            }
            for (int j =i;j<=rows;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
