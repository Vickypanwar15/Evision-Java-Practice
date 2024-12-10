package com.sept23;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class FlatMapDemo {
    public static void main(String[] args) {
        List<String> product1 = Arrays.asList("laptop","computer","mobile","keyboard");
        List<String> product2 = Arrays.asList("Projector","scanner","Light pen");
        List<String> product3 = Arrays.asList("Pen-drive","Adapter","Charger");

        List<List<String>> allProduct = new ArrayList<List<String>>();
        allProduct.add(product1);
        allProduct.add(product2);
        allProduct.add(product3);

        List<String> all = allProduct.stream().flatMap(pList->pList.stream()).toList();
        System.out.println(all);

    }
}
