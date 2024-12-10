package com.java8;

import java.util.ArrayList;
import java.util.List;

public class Product {
        private int productId;
        private String productName;
        private int price;

        public Product(int productId, String productName, int price) {
            this.productId = productId;
            this.productName = productName;
            this.price = price;
        }

        public int getProductId() {
            return productId;
        }

        public String getProductName() {
            return productName;
        }

        public int getPrice() {
            return price;
        }

        @Override
        public String toString() {
            return  "Product Id:"+productId+" : "+"product Name:"+productName+" : "+"Price :"+price+"\n";
        }

        public static List<Product> createProductList(){
            List<Product> productList = new ArrayList<>();
            productList.add(new Product(24510,"Infinix",16000));
            productList.add(new Product(24610,"Vivo",11000));
            productList.add(new Product(24710,"Airtel",8000));
            productList.add(new Product(25410,"Oppo",22000));
            productList.add(new Product(32210,"Iphone",160000));
            productList.add(new Product(42210,"Realme",12000));
            productList.add(new Product(52210,"Dell",55000));
            productList.add(new Product(62210,"HP",76000));
            productList.add(new Product(72210,"Acer",70000));
            return productList;
        }
}
