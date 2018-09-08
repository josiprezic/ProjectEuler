package com.josiprezic.projecteuler;

/*
* Problem 4
*Largest palindrome product
*A palindromic number reads the same both ways. The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 × 99.
*Find the largest palindrome made from the product of two 3-digit numbers.
* */

// TODO: isPalidrome refactoring: split a string of a number into two arrays, do reverse of the first one and compare with second one.

public class Task4 {
    private static int maxPalidrome = 0;
    public static void run() {
        checkNumbers(100, 999);
        System.out.println("TASK 4: " + maxPalidrome);
    }

    private static boolean checkNumbers(int from, int to) {
        int maxOffset = to - from;
        for (int i = 0; i < maxOffset; i++) {
            checkNumbersWithOffset(from, to, i);
        }
        return true; //temp return
    }

    private static boolean checkNumbersWithOffset(int from, int to, int offset) {
        int firstNumber;
        int secondNumber;
        for (int i = to; i > from; i--) {
            firstNumber = i;
            secondNumber = i - offset;
            if (secondNumber < 100) {
                continue;
            }
            int result = firstNumber * secondNumber;

            if (isPalidrome(result)) {
                //System.out.println("numbers = " + firstNumber + " " + secondNumber);
                return true;
            }
        }
        return false;
    }

    private static boolean isPalidrome(int n) {
        String s = Integer.toString(n);
        int length = s.length();
        Character firstChar;
        Character lasthar;
        for (int i = 0; i < length/2; i++) {
            firstChar = s.charAt(i);
            lasthar = s.charAt(length-i-1);
            if (firstChar != lasthar) {
                return false;
            }
        }
        //System.out.println("Palidrome found: " + n);
        palidromeFound(n);
        return true;
    }

    private static void palidromeFound(int palidrome) {
        if (maxPalidrome < palidrome) {
            maxPalidrome = palidrome;
        }
    }
}
