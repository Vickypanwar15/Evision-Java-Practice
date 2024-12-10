package com.collection.question;

import java.util.LinkedHashSet;

public class LinkedHashSetDemo {
    public static void main(String[] args) {
        LinkedHashSet<String> dpt = new LinkedHashSet<String>();
            dpt.add("IT");
            dpt.add("Fire");
            dpt.add("Backend");
            dpt.add("Account");
            dpt.add("Testing");
        System.out.println(dpt);
        dpt.remove("Backend");
        System.out.println(dpt);
        System.out.println(dpt.contains("IT"));
    }
}
