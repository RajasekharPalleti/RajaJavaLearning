package switchlearning;

public class normalInputNormalOutput {

	public static void main(String[] args) {
		int a = 5; // Passing an int because switch will accept int, char, string, byte and short.

		switch (a) { // passing variable value in switch conditional statement
		case 1:
			System.out.println("Provided number is 1");
			break;
		case 2:
			System.out.println("Provided number is 2");
			break;
		case 5:
			System.out.println("Provided number is 5");
			break;
		default:
			System.out.println("Provided number is not in list execute the null method to pass the test");
		}
	}

}
