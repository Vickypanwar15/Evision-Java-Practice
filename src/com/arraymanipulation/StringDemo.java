package com.arraymanipulation;

import java.util.ArrayList;

public class StringDemo {
    public static void main(String[] args) {
        String s = new String("ABC");
        System.out.println("Value of s :"+s+"------>"+s.hashCode());

        s="ABC";
        System.out.println("Value of s :"+s+"------>"+s.hashCode());
        s="KSA";
        System.out.println("Value of s :"+s+"------>"+s.hashCode());

        String m = new String("kkk");
        System.out.println("Value of m:"+m+"------>"+m.hashCode());
        s = m;
        System.out.println("Value of s:"+s+"------>"+s.hashCode());
        ArrayList arrayList = new ArrayList<>();
        arrayList.add(12);
        ArrayList arrayList1 =  new ArrayList<>();
        arrayList1.add(99);
        arrayList=arrayList1;
        System.out.println(arrayList);
    }
}
