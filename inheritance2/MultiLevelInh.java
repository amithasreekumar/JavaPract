package inheritance2;

class GrandParent {
	static void methOne() {
		System.out.println("one GP");
	}

	static void methTwo() {
		System.out.println("Two GP");
	}
}

class Parent extends GrandParent {
	static void methThree() {
		System.out.println("Three P");
	}

	static void methFour() {
		System.out.println("Four P");
	}

}

public class MultiLevelInh extends Parent {
	
	static void methfive() {
		System.out.println("Five child");
	}

	static void methsix() {
		System.out.println("six child");
	}

	public static void main(String[] args) {
		
		methOne();
		methTwo();
		methThree();
		methFour();
		methfive();
		methsix();
	}

}
