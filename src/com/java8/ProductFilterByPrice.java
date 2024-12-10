package com.java8;

import java.util.ArrayList;
import java.util.List;

public class ProductFilterByPrice {
    static  int count =1;
    public static void main(String[] args) {

        List<Product> productList = Product.createProductList();
        productList.stream().filter(p ->p.getPrice() > 30000).forEach(product -> {
            System.out.println(count+")."+"Product Id :"+product.getProductId());
            System.out.println("Product Name:"+product.getProductName());
            System.out.println("Price :"+product.getPrice());
            System.out.println("----------------------");
            count++;
        });

    }
}
