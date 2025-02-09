package org.ArraysLearning;

public class DeclarationOfArrays {

	// Arrays are used to represent group of elements as a single entity but these
	// elements are homogeneous and fixed in size.
	// The size of an array is fixed once created its not possible to increase or
	// decrease the size.
	// Array will start from 0th index ex: you want first position of array means we
	// need to use 0th index of array like a[0].

	public static void main(String[] args) {

		// Arrays can be declared in the below ways

		int a[] = { 10, 22, 3, 4, 2, 1 }; // declaring variable, instantiation and initialization is done at once

//		int[] b = new int[4]; // declaring variable and instantiation is done here
//		b[0] = 7; // Initialization
//		b[1] = 8;
//		b[2] = 9;
//		b[3] = 10;
////		b[4] = 20; // It will through index out of bound exception because the assigned length of
//					// array is 4 and we assigned 5 values.
//
//		int[] anArray;
//		anArray = new int[2];
//		anArray[0] = 11;
//		anArray[1] = 12;

		int sum = 0;

		for (int a1 : a) { // This is call for each, this iteration will take the value from a with each
							// index and will store in a1 variable.
			sum = sum + a1; // Storing a1 value into sum by adding sum value
		}
		System.out.println("the sum of array a is : " + sum);
		
		int min = a[0];
		for (int small = 1; small<a.length; small++) {
			if (min>a[small]) {
				min = a[small];
			}
		}
		System.out.println("Smallest value is : "+min);
		
		int max = a[0];
		for (int big = 1; big<a.length; big++) {
			if (max<a[big]) {
				max = a[big];
			}
		}
		System.out.println("Maximum number is : "+max);
	}

}
