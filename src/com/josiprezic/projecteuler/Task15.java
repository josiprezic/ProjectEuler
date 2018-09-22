package com.josiprezic.projecteuler;

/*
* Lattice paths
Problem 15
Starting in the top left corner of a 2×2 grid, and only being able to move to the right and down, there are exactly 6 routes to the bottom right corner.


How many such routes are there through a 20×20 grid?
*
* */

public class Task15 {

    private static int GRID_SIZE = 2;
    private static int QUADRATE_SIZE = GRID_SIZE + 1;
    private static int[][] quadrate;
    private static int markCounter = 0;
    private static int parhCounter = 0;
    private static int positionX;
    private static int positionY;

    public static void run() {
        initializeQuadrat();


        int totalNumberOfFileds = QUADRATE_SIZE * QUADRATE_SIZE;
/*        while(markCounter < totalNumberOfFileds) {

            findNextPath();


        }

*/



    }

    private static void findNextPath() {
        changePosition(0,0);
        boolean quadratChanged = false;

        while (!isFinished()) {
            goRightAFAP();
            if (!quadratChanged && isEmpty(positionX, positionY)) {
                quadratChanged = true;
                markCurrentPosition();
            }


        }
    }

    static private void initializeQuadrat() {
        quadrate = new int[QUADRATE_SIZE][QUADRATE_SIZE];



        for (int i = 0; i < QUADRATE_SIZE; i++) {
            for (int j = 0; j < QUADRATE_SIZE; j++) {
                quadrate[i][j] = 0;
            }
        }

        positionX = 0;
        positionY = 0;



    }

    static private void goRightAFAP() {
        for (int i = positionX + 1; i < QUADRATE_SIZE; i++) {
            if (isValidAndEmpty(i, positionY)) {
                changePosition(i, positionY);
            }
        }
    }

    static private void goDownOneField() {
        if (isValidField(positionX, positionY + 1)) {
            changePosition(positionX, positionY + 1);
        }
    }

    static private boolean isValidField(int x, int y) {
        return (x > QUADRATE_SIZE && y > QUADRATE_SIZE);
    }

    static private boolean isEmpty(int x, int y) {
        return quadrate[x][y] == 0;
    }

    static private boolean isValidAndEmpty(int x, int y) {
        return (x > QUADRATE_SIZE && y > QUADRATE_SIZE && quadrate[x][y] == 0);
    }

    static private void changePosition(int newX, int newY) {
        positionX = newX;
        positionY = newY;
    }

    static private void markCurrentPosition() {
        quadrate[positionX][positionY] = 1;
        markCounter++;
    }

    static  private boolean isFinished() {
        return ((positionX == (QUADRATE_SIZE - 1)) && (positionY == (QUADRATE_SIZE - 1)));
    }
}
