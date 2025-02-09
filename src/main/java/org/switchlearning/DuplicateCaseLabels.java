package switchlearning;

public class DuplicateCaseLabels { // This is the program about duplicate case labels
	public static void main(String[] args) {
		int a = 10;
		switch (a) {
		case 1:
			System.out.println("case 1 is executed");
			break;
		case 10:
			System.out.println("case 10 is executed");
			break;
		// case 10 : System.out.println("case 10 written 2 times"); break;
		default:
			System.out.println("default is executed");
			// error for this program : Exception in thread "main" java.lang.Error:
			// Unresolved compilation problems:
			// Duplicate case
			// Duplicate case
			// at
			// LearingJava/switchlearning.DuplicateCaseLabels.main(DuplicateCaseLabels.java:8)
		}

	}

}
