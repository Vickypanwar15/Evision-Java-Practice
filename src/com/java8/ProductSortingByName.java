package com.java8;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ProductSortingByName {
    public static void main(String[] args) {
        List<Product> productList = Product.createProductList();
        ArrayList l = new ArrayList();
        System.out.println("Descending order of product list using product name");
        productList.stream().sorted(Comparator.comparing(Product::getProductName).reversed()).forEach(System.out::println);
    }
}
