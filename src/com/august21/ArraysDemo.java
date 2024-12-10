package com.august21;

public class ArraysDemo {
    public static void main(String[] args) {
        int[] arr = new int[4];
        for (int i : arr){
            System.out.print(i+" ");
        }
        System.out.println();
        String[] s1 = new String[5];
        for (String i : s1){
            System.out.print(i+" ");
        }
        double[] d = new double[5];
        System.out.println();
        for (double i : d){
            System.out.print(i+" ");
        }
        char[] ch = new char[5];
        System.out.println();
        for (char i : ch){
            System.out.print(i+" ");
        }
        boolean[] b1 = new boolean[5];
        System.out.println();
        for (boolean i : b1){
            System.out.print(i+" ");
        }
        short[] s2 = new short[5];
        System.out.println();
        for (short s : s2){
            System.out.print(s+" ");
        }
        byte[] b3 = new byte[5];
        System.out.println();
        for (byte b2 : b3){
            System.out.println(b2);
        }
    }
}
