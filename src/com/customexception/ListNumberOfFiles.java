package com.customexception;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

class  NegativeNumberException extends RuntimeException{
    NegativeNumberException(String s){
        super(s);
    }
}
public class ListNumberOfFiles {
    public static void main(String[] args) {
        ArrayList<Integer> lst = new ArrayList<>();
        lst.add(212);
        lst.add(221);
        lst.add(433);
        lst.add(-2323);
        lst.add(4334);
        lst.add(-1000);
        lst.add(221);
        lst.add(-2354);
        System.out.println(lst);
//        to write list data to the file
        PrintWriter pw;
        try{
            pw = new PrintWriter(new FileWriter("ListNumber.txt"));
            for (int arr : lst){
                pw.println(arr);
                pw.flush();
            }
        }
        catch (FileNotFoundException f){
            System.out.println("file not found create a file");
        }
        catch (IOException io){
            System.out.println(io);
        }

//        to read list number data from file and if number is negative than throw exception

        try{
            FileReader f = new FileReader("ListNumber.txt");
            Scanner scanner = new Scanner(f);
            while (scanner.hasNext()){
                int s = Integer.parseInt(scanner.nextLine());
                if(s < 0){
                    throw  new NegativeNumberException("Error :Negative Number present in list");
                }
                else{
                    System.out.println(s);
                }
            }
        }
        catch (IOException i){
            System.out.println(i);
        }
        catch (NegativeNumberException n){
            System.out.println();
            System.out.println(n);
        }
    }
}
