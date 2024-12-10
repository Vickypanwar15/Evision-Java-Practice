package com.collection.question;

import java.util.Vector;

public class VectorDemo {
    public static void main(String[] args) {
        Vector v1 = new Vector();
        v1.addElement(1200);
        v1.addElement(2300);
        v1.addElement(3000);
        System.out.println(v1);
        Vector v2 = new Vector();
        v2.addElement("Vishal");
        v2.addAll(v1);
        v2.addElement("Avinash");
        v2.addElement(34534);
        System.out.println(v1);
        System.out.println(v2);
        Vector v3 = new Vector(v2);
        System.out.println(v3.hashCode());
        System.out.println(v2.hashCode());
        System.out.println(v2);
        System.out.println(v3);
        v2.addElement("In v2 ");
        System.out.println(v2);
        System.out.println(v3);
        System.out.println(v3.hashCode());
        System.out.println(v2.hashCode());

        Vector v4 = new Vector(7,20);
        System.out.println("Size:"+v4.size()+" : Capacity :"+v4.capacity());

        v4.addAll(v2);
        System.out.println("Size:"+v4.size()+" : Capacity :"+v4.capacity());

        v4.addAll(v3);
        System.out.println("Size:"+v4.size()+" : Capacity :"+v4.capacity());

        v4.addAll(v1);
        System.out.println("Size:"+v4.size()+" : Capacity :"+v4.capacity());

        System.out.println(v4);

        v4.removeElement("Vishal");
        System.out.println(v4);
        v4.removeElementAt(3);
        System.out.println(v4);
//        v4.removeAllElements();
        System.out.println(v4.isEmpty());
        System.out.println(v4.firstElement()+" : "+v4.lastElement());
        System.out.println("Size:"+v4.size()+" : Capacity :"+v4.capacity());
    }
}
