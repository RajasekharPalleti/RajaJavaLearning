package org.ArraysLearning;

public class CopyOneArrayValuesToSecArray {

	public static void main(String[] args) {
		int[] a = new int[] {2,3,4,5,6,7,8,33,44,55,66,77,88,88};
		int[] b = new int[a.length];
		System.out.print("b[] values is ");
		
		for (int i = 0; i<a.length; i++) {
			b[i] = a[i];
			System.out.print(b[i]+" ");
		}
	}

}
