package com.josiprezic.projecteuler;

/*
Smallest multiple
Problem 5
2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.
What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?
* */

public class Task5 {

    public static void run() {
        System.out.println("TASK 5: " + getResult(20));
    }

    private static int getResult(int maxNumber) {
        return magicNumber(maxNumber, maxNumber);
    }

    private static int magicNumber(int max, int currentResult){

        if (max <= 2) {
            return currentResult;
        }

        int temp = currentResult;
        while (currentResult % max != 0) {
            currentResult += temp;
        }

        return magicNumber(max - 1, currentResult);
    }
}
