package com.dz13;

public class Main {

    public static void main(String[] args) {

    }

    public static double getArrayAverage (int array [][]) {
        int sum = 0;
        int amount = 0;
        for (int i = 0; i < array.length ; i++) {
            for (int j = 0; j < array[i].length; j++) {
                sum += array [i][j];
                amount++;
            }
        }
        double average = (double) sum/amount;
        return average;
    }

    public static boolean checkIfSquare (int array [][]) {
        for (int i = 0; i < array.length; i++) {
            if (array.length != array[i].length) {
                return false;
            }
        }
        return true;
    }
}
