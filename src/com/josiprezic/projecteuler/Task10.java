package com.josiprezic.projecteuler;

/*
* Summation of primes
Problem 10
The sum of the primes below 10 is 2 + 3 + 5 + 7 = 17.

Find the sum of all the primes below two million.
*/

public class Task10 {
    private static long max = 2000000L;

    public static void run() {
        long sum = 1L;

        for (long i = 1; i < max; i += 2) {
            //System.out.println("Current sum: " + sum);
            sum += isPrime(i) ? i : 0;
        }

        System.out.println("TASK 10: " + sum);
    }

    private static boolean isPrime(long n) {
        if (n % 2 == 0) {
            return false;
        }

        for (long i = 3; i < n; i += 2) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
