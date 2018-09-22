package com.josiprezic.projecteuler;

/*
* Longest Collatz sequence
Problem 14
The following iterative sequence is defined for the set of positive integers:

n → n/2 (n is even)
n → 3n + 1 (n is odd)

Using the rule above and starting with 13, we generate the following sequence:

13 → 40 → 20 → 10 → 5 → 16 → 8 → 4 → 2 → 1
It can be seen that this sequence (starting at 13 and finishing at 1) contains 10 terms. Although it has not been proved yet (Collatz Problem), it is thought that all starting numbers finish at 1.

Which starting number, under one million, produces the longest chain?

NOTE: Once the chain starts the terms are allowed to go above one million.
* */

public class Task14 {

    private static long MAX_ALLOWED_NUMBER = 1000000;

    public static void run() {

        long currentChainCounter;
        long currentNumber;
        long chainCounterMax = 0;
        long collatszNumberMax = 0;

        for (long i = 1; i < MAX_ALLOWED_NUMBER; i++) {

            currentNumber = i;
            //System.out.println("Current number: " + currentNumber);
            currentChainCounter = 0;

            while (currentNumber != 1) {
                currentChainCounter++;
                if(currentNumber % 2 == 0) {
                    currentNumber /= 2;

                } else {
                    currentNumber = (3 * currentNumber) + 1;
                }
            }
            if (currentChainCounter > chainCounterMax) {
                chainCounterMax = currentChainCounter;
                collatszNumberMax = i;
            }
        }

        System.out.println("TASK 14: " + collatszNumberMax);

    }

}
