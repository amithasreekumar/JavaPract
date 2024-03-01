package basicprogram;

public class ConsOverloadingHw {

	public static void main(String[] args) {

		new ConsOverloadingHw();
		new ConsOverloadingHw("amitha");
		new ConsOverloadingHw('c');
		new ConsOverloadingHw(234);
		// new ConsOverloadingHw();

	}

	public ConsOverloadingHw() {
		System.out.println("constructor 1");
	}

	ConsOverloadingHw(String a) {
		System.out.println("constructor string");
	}

	ConsOverloadingHw(int a) {
		System.out.println("constructor int");
	}

	ConsOverloadingHw(char a) {
		System.out.println("constructor char");
	}

	ConsOverloadingHw(boolean a) {
		System.out.println("constructor boolean");
	}
}
