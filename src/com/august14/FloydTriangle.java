package com.august14;

import java.util.Scanner;

public class FloydTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter row number");
        int row = scanner.nextInt();
        int count =1;
        for(int i=0;i<row;i++){
            for(int j=0;j<=i;j++){
                System.out.print(count+" ");
                count++;
            }
            System.out.println();
        }
    }
}
