package com.august14;

public class SwitchDemo {
    public static void main(String[] args) {
        int num=7;
        int a = 15;

        int b = 10;

        int c = a-- - --b + ++a;
        System.out.println(c);

        switch (num){
            case 1:
            case 3:
                System.out.println("Odd");
            case 2:
            case 4:
                System.out.println("Even");
                break;
            default:
                System.out.println("Other");
        }
    }
}
