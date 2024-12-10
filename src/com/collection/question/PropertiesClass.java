package com.collection.question;

import com.java8.Product;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesClass {
    public static void main(String[] args) throws IOException {
        Properties p = new Properties();
        FileInputStream fis = new FileInputStream("property.txt");
        p.load(fis);
        String user = p.getProperty("username");
        String pass = p.getProperty("password");
        System.out.println("UserName :"+user);
        System.out.println("Password :"+pass);
    }
}
