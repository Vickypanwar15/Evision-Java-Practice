package com.august14;

public class PatternProgram {
    public static void main(String[] args) {
        int count =1;
        for(int i=0;i<4;i++){
            for (int j=0;j<=i;j++){
                System.out.print(count+" ");
                count++;
            }
            System.out.println();
        }
    }
}
