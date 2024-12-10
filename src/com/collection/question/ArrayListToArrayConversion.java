package com.collection.question;

import java.util.ArrayList;

public class ArrayListToArrayConversion {
    public static void main(String[] args) {
        ArrayList<String> name = new ArrayList<>();
        name.add("Akashy");
        name.add("Govinda");
        name.add("Varun");
        name.add("Vicky");
        name.add("Aditya");

        System.out.println("ArrayList before conversion to array: " + name);

        // Convert ArrayList to array
        String[] arr = name.toArray(new String[0]);

        // Print array elements (uppercase)
        System.out.println("Array after conversion:");
        for (String str : arr) {
            System.out.print(str.toUpperCase() + " , ");
        }

        // Add a new element to ArrayList
        System.out.println("\n\nAdding 'Avinash' to ArrayList...");
        name.add("Avinash");

        // Print ArrayList to show it's updated
        System.out.println("Updated ArrayList: " + name);

        // Print the array again to show that it's not updated
        System.out.println("Array after adding 'Avinash' to ArrayList:");
        for (String str : arr) {
            System.out.print(str.toUpperCase() + " , ");
        }

    }
}
