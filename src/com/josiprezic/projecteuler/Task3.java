package com.josiprezic.projecteuler;

/*
* Problem 3
* Largest prime factor
*
*The prime factors of 13195 are 5, 7, 13 and 29.

What is the largest prime factor of the number 600851475143 ?
*
* */

public class Task3 {

    public static void run() {
        long n = 600851475143L;
        long largestPrime = 1;

        while (n % 2 == 0) {
            largestPrime = 2;
            n /= 2;
        }

        for (int i = 3; i < Math.sqrt(n); i += 2) {
            while (n % i == 0) {
                largestPrime = i;
                n = n / i;
            }
        }

        if (n>2){
            largestPrime = n;
        }

        System.out.println("TASK 3: " + largestPrime);
    }
}
