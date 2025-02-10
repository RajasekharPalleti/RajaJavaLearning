package org.example;

public class PrintEvenNumbersInArray {
    public static void main(String[] args) {
        int[] numbers = {2,2,3,4,5,6,7,8,9,10};
        int sum = 0;
        for (int number : numbers) {
            if (number % 2 == 0) {
                sum = sum + number;
                System.out.print(number + " ");
            }
        }
        System.out.println("Sum = " + sum);
    }
}
