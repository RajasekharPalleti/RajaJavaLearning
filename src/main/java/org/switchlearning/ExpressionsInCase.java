package switchlearning;

public class ExpressionsInCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a = 100;

		switch (a) {
		case 10 + 20 + 50: //it is possible that expressions is also works in case label
			System.out.println("step one is 80");
			break;
		case 120/2:
			System.out.println(" stepe 2 is 60");
			break;
		case 40 + 60:
			System.out.println("step 3 is 100");
			break;
		//case a : 
			//System.out.println("constant value is required"); // we have to provide constant value not a variable
		//error as below 
		//Unresolved compilation problem: case expressions must be constant expressions
			//break;
		default:
			System.out.println("default is executed");

		}

	}

}
