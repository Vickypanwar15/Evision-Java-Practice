package com.august13;

public class OperatorsDemo {
    public static void main(String[] args) {
        int a=16;
        System.out.println(a++);    //16
        System.out.println(++a);    //18
        System.out.println(a--);    //18
        System.out.println(--a);    //16

        int b = 4;
        int c=6;
        int d = 20;
        int ans = d/c - ++b - c-- * 10 + ++a - d-- + d/2;  //  19/5 - 5 - 6 * 10 + 17 - 20 + 19/2  // 3 - 5 -60 + 17 -20 + 8
        System.out.println(ans);

        // shift operators demo

        int s1 = 20;
        System.out.println(s1 << 2);  // 20 * 2^2 // 20 *2 ==>80
        System.out.println(200>> 4);  // 200/ 2^4 // 200/16 ==>12

        System.out.println(s1 & b);
//        20 ==>           00010100
//        4 ==>            00000100
//        Ans=>            00000100 => 4

        System.out.println(s1 | b);
//        20 ==>           00010100
//        5 ==>            00000101
//        Ans=>            00010101 => 20
    }
}
