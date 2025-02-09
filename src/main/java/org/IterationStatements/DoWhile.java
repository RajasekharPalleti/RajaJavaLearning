package org.IterationStatements;

public class DoWhile {

	public static void main(String[] args) {
		
		// Do while will use when there is login that statements/body needs to execute at-least once to get the value
		// In Do while body will executes first and then condition will execute
		// In do while the while must be ends with semicolon other wise the will get compilation error/syntax error
		// Here do is taking the body and while is taking the condition and it must be boolean
		
		int i = 10;
		do {
			System.out.println(i);
			i--;
		}while(i>1);
		
		
//		int j = 10;
//		do {
//			System.out.println(j);
//			j++;
//		}while(true);
//		System.out.println("Unreaclable statement as the loop will not come out"); // Un-reachable statement
		
		int k = 0;
		do {
			System.out.println(k);
			k++;
		}while(false);
		System.out.println("this out side of dowhile for k" +k);
		

	}

}
