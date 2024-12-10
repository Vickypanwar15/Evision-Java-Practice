package com.august14;

import java.util.Scanner;

public class PyramidPattern {
    public static void main(String[] args) {
        System.out.println("Enter row number");
        int rows = new Scanner(System.in).nextInt();
        for(int i=1;i<=rows;i++){
            for(int space = rows;space>i;space--){
                System.out.print(" ");
            }
            for(int j=0;j<i;j++){
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
}
