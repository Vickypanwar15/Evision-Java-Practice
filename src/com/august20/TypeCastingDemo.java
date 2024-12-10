package com.august20;

public class TypeCastingDemo {
    public static void main(String[] args) {
        System.out.println("Widening Type Casting or Upcasting that is implicit perform");
        int a = 6343;
        double d = 3743489.4545;
        float f= 476.43f;
        long l = 237823734;
        System.out.println("To convert int to double");
        double d1 = a;
        System.out.println(d1);
        double d2 = f;
        System.out.println("Float to double:"+d2);
        System.out.println("---------------------------");
        System.out.println("Narrowing ype casting or down casting that is explicit perform by programmer");

        int value= (int)763483.56349; // down casting

        System.out.println("Double to int :"+value);

    }
}
