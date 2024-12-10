package com.august14;

import java.util.Scanner;

public class Pattern3 {
    public static void main(String[] args) {
        System.out.println("Enter row number");
        int rows = new Scanner(System.in).nextInt();
        for(int i=1;i<=rows;i++){
            for (int space = rows;space>=i;space--){
                System.out.print(" ");
            }
            for (int j=1;j<=i;j++){
                System.out.print("@");
            }
            System.out.println();
        }
    }
}
