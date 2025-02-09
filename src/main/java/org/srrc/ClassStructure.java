/**
 * 
 */
package srrc;

/**
 * 
 */
class ClassStructure {
	
	{
		System.out.println("Instance Block ");
		
	}

	public static void printHello() {
		System.out.println("Hello");
	}

	static int a = 10;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("ClassStructure from main methofd                " + a);
		ClassStructure cs = new ClassStructure();
		printHello();
		B b = new B("");
		B b1 = new B();
		C c = new C();

		c.m2();
		b.m1();

	}

	static {
		System.out.println("This is a 2nd static  block" + a);
	}
	static {
		System.out.println("This is a static block");
	}

}

class B {
	String bInstanceVariable;

	B() {
		System.out.println("Instance constructre");
	}

	B(String s1) {
		this.bInstanceVariable = s1;
	}

	void m1() {
		System.out.println("ClassStructure from Class B        " + bInstanceVariable);
	}
}

class C {
	void m2() {
		System.out.println("ClassStructure from Class C        ");
	}
}
