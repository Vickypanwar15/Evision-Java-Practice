package com.java8;

import java.util.Comparator;
import java.util.List;

public class ProductSortingById {
    public static void main(String[] args) {
        List<Product> productList = Product.createProductList();
        System.out.println(" ***** Sorting by ascending order of product id  *****");
        productList.stream().sorted(Comparator.comparingInt(Product::getProductId)).forEach(System.out::println);

        int totalPrice = productList.stream().filter(product -> product.getPrice()<20000).map(Product::getPrice).reduce(0,(sum,price)->sum+price);
        System.out.println("Total Product price :"+totalPrice);
    }
}
