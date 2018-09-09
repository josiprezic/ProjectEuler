package com.josiprezic.projecteuler;

/*
* 10001st prime
Problem 7
By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see that the 6th prime is 13.

What is the 10 001st prime number?*/

public class Task7 {

    public static void run() {
        int primeCounter = 1;
        int currentNumber = 3;
        int currentPrime = 2;

        while (primeCounter < 10001) {

            if (isPrime(currentNumber)) {
                primeCounter++;
                currentPrime = currentNumber;
            }
            currentNumber++;
        }
        System.out.println("TASK 7: " + currentPrime);
    }

    private static boolean isPrime(int n) {
        if (n % 2 == 0) {
            return false;
        }

        for (int i = 3; i < n; i += 2) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
