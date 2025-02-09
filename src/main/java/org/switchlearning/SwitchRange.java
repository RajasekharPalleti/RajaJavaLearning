package switchlearning;

public class SwitchRange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		byte b = 127;

		switch (b) {

		case 126:
			System.out.println("126");
		case 127:
			System.out.println("127");
//		case 128:
//			System.out.println("128"); // the byte length is -128 to 127 but this case value is 128 and it will treat
										// as integer. we need to pass as per the declared data type
		}

	}

}
