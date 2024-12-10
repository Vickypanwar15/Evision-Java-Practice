package com.august13;

public class FactorialProgram {
    public static void main(String[] args) {
        int num =7;
        int f=1;
        for(int i = num;i>=1;i--){
            f*=i;
        }
        System.out.println(f);
    }
}
