package com.java8;

import java.util.Scanner;

@FunctionalInterface
interface TaxCalculate{
    public double findtax(double salary);
    static int sum(int a,int b){
        int result = a+b;
        return result;
    }
}
public class FunctionalInterfaceDemo {
    public static void main(String[] args) {
        System.out.println("Enter your salary");
        double salary = new Scanner(System.in).nextInt();
        TaxCalculate tax = (empsalary) ->{
            if(empsalary > 100000){
                return empsalary * 8/100;
            } else if (empsalary >50000) {
                return  empsalary * 6/100;
            } else if (empsalary >30000) {
               return empsalary * 4/100;
            }
            else{
                System.out.println("Not eligible to pay the tax");
            }
            return 0;
        };
        double tax1 = tax.findtax(salary);
        System.out.println("Calculated Tax is :"+tax1);
    }
}
