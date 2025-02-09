package org.ArraysLearning;

public class FebonacciSeries {

	public static void main(String[] args) {
		
		int a = 0;
		int b = 1;
		System.out.print("Fibonacci series : "+a+" "+b);
		for (int i = 2; i<50; i++) {
			int next = a+b;
			System.out.print(" "+next);
			a = b;
			b = next;	
		}

		// Using arrays
		
		int[] c = {0,1};
		System.out.println("");
		System.out.print("Fibonacci series : "+c[0]+" "+c[1]);
		for (int j = 2; j<50; j++) {
			int next = c[0]+c[1];
			System.out.print(" "+next);
			c[0] = c[1];
			c[1] = next;
		}
		
	}

}
