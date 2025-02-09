package switchlearning;

public class IncompaatiableSwitchCases {
	public static void main(String[] args) {
		char ch = 'a';

		switch (ch) {
//		case "aaa":
//			System.out.println("case aaa is executed"); // the provided switch is string but the given switch value is
														// char which will through Unresolved compilation problem: Type
														// mismatch: cannot convert from String to char
			//break; // if we keep break at before case it will through an syntax error SwitchLabels expected after this token
		
		
		case 10:
			System.out.println("case 10 is executed");
			break;
		default : System.out.println("This is default case"); // default case can be keep between the cases it will not through any error
		case 'a':
			System.out.println("case a is executed");
			break;
		//default : System.out.println("This is 2nd default case"); // two default case should not be defined
		}
	}

}
