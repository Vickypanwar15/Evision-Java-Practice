package com.august14;

import java.sql.SQLOutput;
import java.util.Scanner;

public class QuadraticEquation {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first value");
        double a = sc.nextDouble();
        System.out.println("Enter Second value");
        double b = sc.nextDouble();
        System.out.println("Enter Third value");
        double c = sc.nextDouble();

        double result = b*b - 4 * a * c;
        double sqroot = Math.sqrt(result);
        System.out.println(sqroot);
        double root1;
        double root2;
        if(result > 0.0){
            root1 = (-b + sqroot) / (2 * a);
            root2 = (-b - sqroot) / (2 * a);
            System.out.println("Root 1 is :"+root1);
            System.out.println("Root 2 is :"+root2);
        } else if(result==0.0){
            root1 = (-b / (2 * a));
            root2 = (-b / (2 * a));
            System.out.println("Root 1 is :"+root1);
            System.out.println("Root 2 is :"+root2);
        }
        else {
            System.out.println("Numbers are complex");
        }

    }
}
