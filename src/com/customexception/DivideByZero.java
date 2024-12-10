package com.customexception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class DivideByZero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int result;
        try{
            int num1 = scanner.nextInt();
            int num2 = scanner.nextInt();
           result = num1/num2;
            System.out.println("Answer:"+result);
        }catch (ArithmeticException e){
            System.out.println("Divide by zero in not possible enter valid integer number");
        }
        catch (InputMismatchException e){
            System.out.println("Please enter only integer type value other value is not consider");
        }
    }
}
