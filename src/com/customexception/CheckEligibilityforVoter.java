package com.customexception;

import java.util.InputMismatchException;
import java.util.Scanner;

class TooYoungException extends Exception{
     TooYoungException(String s){
         super(s);
     }
}

public class CheckEligibilityforVoter {
    public static void main(String[] args) {
        System.out.println("Enter age :");
        try {
            int age = new Scanner(System.in).nextInt();
            if(age < 18){
                throw new TooYoungException("You are not eligible for voting");
            }
            else{
                System.out.println("You are eligible for voting");
            }
        }
        catch (TooYoungException t){
            System.out.println(t);
        }
        catch (InputMismatchException e){
            System.out.println("Enter only integer value");
        }
    }
}
