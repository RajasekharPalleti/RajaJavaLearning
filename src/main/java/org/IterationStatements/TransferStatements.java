package org.IterationStatements;
// Using transfer statements we are able to transfer the flow of execution from one position to another position
// four types of transfer statements is available
//1. break
//2. continue
//3. return
//4. try

public class TransferStatements {

	public static void main(String[] args) {
		
		for (int i=0; i<10;i++) {
			if(i==5)
				break; // break will comes out of the loop after condition matches
			System.out.println("Print i = " +i);
		}
		
		for (int j=0; j<10;j++) {
			if(j==5)
				continue; // continue will stop executing the current iteration and will continues from next iteration.
			System.out.println("Print j = " +j);
		}

	}

}
