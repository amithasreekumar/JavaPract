package basicprogram;

public class Hwnonstatic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		hello();
		world();
		Hwnonstatic h1 = new Hwnonstatic();
		h1.nonStat1();
		h1.nonStat2();
	}

	static void hello() {
		System.out.println("Hello");
	}

	static void world() {
		System.out.println("world");
	}

	void nonStat1() {
		System.out.println("non Static 1");
	}

	void nonStat2() {
		System.out.println("non Static 2");
	}

}
