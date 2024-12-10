package com.collection.question;

import java.util.ArrayList;
import java.util.Scanner;

public class ListDemo {
    public static void main(String[] args) {
        ArrayList c1 = new ArrayList();
        c1.add(2100);
        c1.add("Vishal");
        c1.add('V');
        c1.add(5754.5645f);
        c1.add(545345884543L);
        System.out.println(c1);
        c1.add(null);
        System.out.println(c1.add(34829));
        System.out.println(c1);

        for (Object o : c1){
            System.out.print(o+" , ");
        }
        System.out.println();
        System.out.println(c1.remove(null));
        System.out.println(c1);
//        insert value at frist index
        c1.add(0,4563);
        c1.add(4,"In middle");
        System.out.println(c1);

        System.out.println("retrive  element at specified index");
        System.out.println(c1.get(5));

        System.out.println("Enter element you want to update");
        String company = new Scanner(System.in).nextLine();
        c1.set(3,company);
        System.out.println(c1);
        c1.remove("Vishal");
        System.out.println(c1);
    }
}
