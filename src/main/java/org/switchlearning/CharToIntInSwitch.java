package switchlearning;

public class CharToIntInSwitch {

	public static void main(String[] args) {

		// Integer to char conversion in switch
		int a = 65;

		switch (a) {
		case 100:
			System.out.println(" case 1 is executed");
			break;
		case 'A':
			System.out.println(" case A is executed"); // here ASCII code of capital A is 65 so switch will convert char
														// to int and executed the case 'A'.
			break;
		default:
			System.out.println(" default is executed");

		}
		// char to integer conversion in switch

		char b = 'a';

		switch (b) {
		case 20:
			System.out.println("case 20 is executed");
			break;
		case 97:
			System.out.println(" case 91 is executed"); // Here character to ASCII conversion is done and executed
														// the case 97.
			break;
		default:
			System.out.println(" 2nd default is executed");
		}

		int c = 10;

		switch (c) {

		case 10:
			System.out.println("case 10 is executed"); // Here the case is satisfied but the break is not given so it
														// will execute until break is given orelse it will execute
														// complete switch
		case 20:
			System.out.println("case 20 is executed");
		case 30:
			System.out.println("case 20 is executed");
		default:
			System.out.println("case default is executed");

		}

	}
}
