package org.example;  // Declares the package name where this class belongs

import java.util.Scanner;  // Imports the Scanner class for user input

public class LeapYearCheck {  // Defines the main class

    public static void main(String[] args) {
        // Create a Scanner object to take user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a year
        System.out.print("Enter a year: ");

        // Read the integer input (year) from the user
        int year = scanner.nextInt();

        // Call the isLeap() method to check if the year is a leap year
        if (isLeap(year)) {
            System.out.println(year + " is a leap year.");  // If true, print it's a leap year
        } else {
            System.out.println(year + " is not a leap year.");  // Otherwise, print it's not a leap year
        }

        // Close the scanner to prevent resource leaks
        scanner.close();
    }

    /**
     * Method to check if a given year is a leap year.
     * A year is a leap year if:
     * - It is divisible by 4 AND not divisible by 100 OR
     * - It is divisible by 400
     *
     * @param n The year to check
     * @return true if the year is a leap year, otherwise false
     */
    public static boolean isLeap(int n) {
        if ((n % 4 == 0 && n % 100 != 0) || (n % 400 == 0)) {
            return true;  // Year is a leap year
        } else {
            return false;  // Year is not a leap year
        }
    }
}

