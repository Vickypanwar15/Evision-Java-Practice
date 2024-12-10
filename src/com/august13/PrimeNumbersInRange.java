package com.august13;

import java.util.ArrayList;

public class PrimeNumbersInRange {
    public static void main(String[] args) {
        boolean isPrime = false;
        ArrayList<Integer> primeNumbers = new ArrayList<>();
        for (int i = 1; i < 100; i++) {
            for (int j = 2; j < i; j++) {
                if (i % j != 0) {
                    isPrime = true;
                }
                else {
                    isPrime = false;
                    break;
                }
            }
            if(isPrime){
                primeNumbers.add(i);
            }
        }
        System.out.println("All prime numbers Between 1 to 100 are :");
        System.out.println(primeNumbers);

    }
}
