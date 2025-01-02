package com.recursion;

public class FibonacciSeries {

    public static  void printFibonacci(int n){

        int firstNum =0;
        int secondNum=1;

        System.out.print(firstNum+" "+secondNum);
        for(int i = 2;i<=n;i++){
            int sum = firstNum + secondNum;
            firstNum = secondNum;
            secondNum =i;
            System.out.print(" "+sum);
        }
    }


    public static void main(String[] args) {

        printFibonacci(5);

    }
}
