package com.josiprezic.projecteuler;

/*
*Sum square difference
Problem 6
The sum of the squares of the first ten natural numbers is,

1^2 + 2^2 + ... + 10^2 = 385
The square of the sum of the first ten natural numbers is,

(1 + 2 + ... + 10)^2 = 55^2 = 3025
Hence the difference between the sum of the squares of the first ten natural numbers and the square of the sum is 3025 − 385 = 2640.

Find the difference between the sum of the squares of the first one hundred natural numbers and the square of the sum.
* */

public class Task6 {
    public static void run() {
        long sumOfSquares = sumOfSquares(100);
        long squareOfTheSum = squareOfTheSum(100);
        long difference = Math.abs(sumOfSquares - squareOfTheSum);
        System.out.println("TASK 6: " + difference);

    }

    private static long sumOfSquares(int max) {
        int sum = 0;
        for (int i = 1; i <= max; i++) {
            sum += Math.pow(i, 2);
        }
        return sum;
    }

    private static long squareOfTheSum(int max) {
        int sum = 0;
        for (int i = 1; i <= max; i++) {
            sum += i;
        }
        return sum * sum;
    }
}
