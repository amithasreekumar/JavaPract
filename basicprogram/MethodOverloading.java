package basicprogram;

public class MethodOverloading {

	static void meth1(int a, int b) {
		System.out.println(a + b);
	}

	static void meth1(int a, String b) {
		System.out.println(a + " " + b);
	}

	public static void main(String[] args) {

		meth1(1, 2);
		meth1(111, "hello world");
	}

}
