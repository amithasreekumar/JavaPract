package basicprogram;

public class ConsExamp {
	ConsExamp()// constructor (no return type needed)
	{
		System.out.println("This is my Constructor");
	}

	public static void main(String[] args) {
		System.out.println("Main Method");
		ConsExamp c1 = new ConsExamp();
		c1.sub();
	}

	static void add() {
		System.out.println("add");
	}

	void sub() {
		System.out.println("sub");
	}

}
