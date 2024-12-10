package com.august27;

import java.util.*;

public class IdentityMapDemo {
    public static void main(String[] args) {
        IdentityHashMap imap =new IdentityHashMap();
        Integer i1 = new Integer(1010);
        Integer i2 = new Integer(1010);
        imap.put(i1,"Vishal");
        imap.put(i2,"Panwar");
        System.out.println(i1==i2);
        System.out.println(imap);
    }
}
