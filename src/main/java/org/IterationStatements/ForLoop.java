package org.IterationStatements;

public class ForLoop {

	public static void main(String[] args) {

		// Without a for loop, we would have to write the same steps multiple times.
		// Loops allow us to iterate the same steps based on a given condition.
		// For loops are used extensively when we know the condition's length.

		// Example 1: Simple for loop
		// 1: Initialization  2: Condition  3: Increment/Decrement
		for (int i = 0; i < 3; i++) {
			// 4: Body/Statement
			System.out.println("Print i at position " + i);
		}

		System.out.println(); // Line break for clarity

		// Example 2: Initializing variable outside the loop
		int j = 1;
		for (; j < 3; j++) { // Initialization inside the loop is optional
			System.out.println("Print j at position " + j);
		}

		System.out.println(); // Line break for clarity

		// Example 3: Printing messages before entering the loop
		int a = 1;
		System.out.println("Preparing to loop:");
		System.out.println("Another preparation step");

		for (; a < 3; a++) {
			System.out.println("Print a at position " + a);
		}

		System.out.println(); // Line break for clarity

		// Example 4: Declaring two variables in the loop
		for (int d = 1, e = 2; d < 3 && e < 4; d++, e++) {
			System.out.println("Print d at position " + d);
			System.out.println("Print e at position " + e);
		}

		// Invalid Examples (commented out with explanations):

		// Error: We cannot declare variables of different types in the initialization.
		// for (int b = 1, char c = 'c'; b > 3; b++) {
		//     System.out.println("Print b: " + b);
		// }

		// Infinite loop due to missing condition:
		// for (int f = 1;; f++) {
		//     System.out.println("Print f at position " + f);
		// }

		// Infinite loop due to missing increment/decrement:
		// for (int g = 0; g < 10;) {
		//     System.out.println("Print g at position " + g);
		// }

		// The compiler will detect unreachable statements here:
		// for (int h = 1; h > 0; h++) {
		//     System.out.println("Print h at position " + h);
		// }
		// System.out.println("Print this message outside the h loop"); // Unreachable

		// Infinite loop since the condition is always true:
		// for (int k = 1; true; k++) {
		//     System.out.println("Print k at position " + k);
		// }
		// System.out.println("This statement is unreachable.");
	}
}
