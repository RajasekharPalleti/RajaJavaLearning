package srrc;

public class WhichIsBigger {

	public static void main(String[] args) {
		int a = 1110;
		int b = 320;
		int c = 145;
		
		int l=a>b?(a>c)?a:c:(b>c)?b:c;
		//(a>b)?(a>c)?a:c:(b>c)?b:c;
		System.out.println(l);

		if (a > b) {
			if (a > c) {
				System.out.println(a + " is big");
			} else {
				System.out.println(c + "is big");
			}
		}

		else if (b > c) {
			System.out.println(b + "is big");
		} else {
			System.out.println(c + "is big");
		}
	}
}
