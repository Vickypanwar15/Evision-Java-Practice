package com.customexception;

import java.util.Scanner;

public class ExceptionMethods {
    public static void main(String[] args) {
        try{
            int n = new Scanner(System.in).nextInt();
        }
        catch (Exception e){
            e.printStackTrace();
            System.out.println(e);
            System.out.println(e.getMessage());
        }
    }
}
