package com.august14;

import java.util.Scanner;

public class HalfOfDiamond {
    public static void main(String[] args) {
        System.out.println("Enter row number");
        int rows = new Scanner(System.in).nextInt();
        for (int i = 0; i < rows; i++) {
            for (int space = rows; space >= i; space--) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        for (int i = rows - 1; i > 0; i--) {
            for (int space = rows; space >= i; space--) {
                System.out.print(" ");
            }
            for (int j = i; j > 0; j--) {
                System.out.print(" *");
            }
            System.out.println();
        }
    }
}
