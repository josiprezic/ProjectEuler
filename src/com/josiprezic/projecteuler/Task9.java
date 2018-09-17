package com.josiprezic.projecteuler;


/*
*Special Pythagorean triplet
Problem 9
A Pythagorean triplet is a set of three natural numbers, a < b < c, for which,

a^2 + b^2 = c^2
For example, 3^2 + 4^2 = 9 + 16 = 25 = 5^2.

There exists exactly one Pythagorean triplet for which a + b + c = 1000.
Find the product abc.
*
* */


import java.util.Arrays;

public class Task9 {

    private static int superSum = 1000;

    public static void run() {

        int minValueA = 1;
        int maxValueA = superSum / 2;

        for(int a = minValueA; a < maxValueA / 2; a++) {
            int minValueB = maxValueA - a;
            int maxValueB = superSum / 2;

            for(int b = minValueB; b < maxValueB; b++) {
                int c = 1000 - a - b;

                if (b > c) {
                    break;
                }

                if (tripletCheck(a,b,c)) {
                    System.out.println("TASK 9: " + (a*b*c));
                    return;
                }
            }
        }

        System.out.println("TASK 9: it doesn't exist");
    }

    private static boolean tripletCheck(int n1, int n2, int n3) {
        int array[]= {n1, n2, n3};
        Arrays.sort(array);

        double c = Math.pow(array[2], 2);
        double a = Math.pow(array[1], 2);
        double b = Math.pow(array[0], 2);

        return (c== (a + b));
    }

}
