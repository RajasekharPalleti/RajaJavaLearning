package org.example;

public class PrintStarPatternTriangle {
    public static void main(String[] args) {
        int rows = 6; // Number of rows in the triangle

        // Outer loop for number of rows
        for (int i = 1; i <= rows; i++) {

            // Inner loop for spaces before stars
            for (int j = rows; j > i; j--) {
                System.out.print(" ");
            }

            // Inner loop for stars
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }

            // New line after each row
            System.out.println();
        }
    }
}