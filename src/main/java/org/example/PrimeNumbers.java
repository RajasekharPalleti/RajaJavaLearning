package org.example;

import java.util.Scanner;

public class PrimeNumbers {
    
    // Method to check if a number is prime using n/2 approach
    public static boolean isPrime(int n) {
        if (n <= 1) return false; // 0 and 1 are not prime

        // Check divisibility from 2 to n/2
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                return false; // If divisible, it's not prime
            }
        }
        return true; // Prime number
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = scanner.nextInt();
        scanner.close();

        if (isPrime(n)) {
            System.out.println(n + " is a prime number.");
        } else {
            System.out.println(n + " is not a prime number.");
        }
    }
}