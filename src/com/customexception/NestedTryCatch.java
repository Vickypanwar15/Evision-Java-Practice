package com.customexception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class NestedTryCatch {
    public static void main(String[] args) {
        try {
            System.out.println("Enter two user input");
            int num = new Scanner(System.in).nextInt();
            int num2 = new Scanner(System.in).nextInt();
            int result = num/num2;
            try{
                int[] arr = {34,54,3,4,5,6};
                System.out.println(arr[6]);
            }
            catch (ArrayIndexOutOfBoundsException e){
                System.out.println("You access the out of range array element");
            }
            finally {
                System.out.println("Inside try exception finally block ");
            }
        }
        catch (InputMismatchException e){
            System.out.println("You enter incorrect data");
        }
        catch (ArithmeticException e){
            System.out.println("Don't divide by zero enter non zero value");
        }
        finally {
            System.out.println("Successful terminates");
        }
    }
}
