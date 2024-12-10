package com.java8;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.function.Function;

class Customer{
    private int customerId;
    private String name;
    private int age;
    private String email;

    public Customer(int customerId,String name, int age, String email) {
        this.customerId = customerId;
        this.name = name;
        this.age = age;
        this.email = email;

    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return  "customerId=" + customerId +
                "\n"+"name=" + name  +
                "\n"+"age=" + age +
                "\n"+ "email=" + email+"\n"+"-------------\n";
    }
}
public class DataTransformation {

    public static void main(String[] args) throws FileNotFoundException {
        ArrayList<Customer> customerList = new ArrayList<Customer>();
        customerList.add(new Customer(1001,"Raju",35,"raju@gmail.com"));
        customerList.add(new Customer(3421,"Shayam",23,"shyam@gmail.com"));
        customerList.add(new Customer(2311,"Munna",43,"munna@gmail.com"));
        customerList.add(new Customer(4221,"Guddu",42,"guddu@gmail.com"));
        customerList.add(new Customer(1012,"Manoj",25,"manoj@gmail.com"));
        customerList.add(new Customer(1548,"Rahul",24,"rahul@gmail.com"));
        customerList.add(new Customer(1341,"Sumit",27,"sumit@gmail.com"));
        customerList.add(new Customer(3211,"Dipanshu",24,"dipsnahu@gmail.com"));
        customerList.add(new Customer(6453,"Himanshu",48,"himanshu@gmail.com"));
        customerList.add(new Customer(3342,"Swami",47,"swami@gmail.com"));

        try (FileWriter writer = new FileWriter("customers.txt")) {
            // Write header
            writer.append("CustomerId,Name,Age,Email\n");

            // Write customer data
            for (Customer customer : customerList) {
                writer.append(String.valueOf(customer.getCustomerId())).append(",")
                        .append(customer.getName())
                        .append(",")
                        .append(String.valueOf(customer.getAge()))
                        .append(",")
                        .append(customer.getEmail())
                        .append("\n");
            }

            System.out.println("Customer list has been written to customers.csv in a readable format.");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
