package basicprogram;

class g_parent {
	void add() {
		System.out.println("add");
	}
}

class parent extends g_parent {
	void sub() {
		System.out.println("sub");
	}
}

public class Upcasting extends parent {
	void multiply() {
		System.out.println("multiply");
	}

	public static void main(String[] args) {
		parent obj = new Upcasting(); //upcasting
		obj.add();
		obj.sub();
		// obj.multiply(); child class properties can not be accessed with obj ref
		// variable
		// to access child class properties we have to create new object.
		
		Upcasting obj2= (Upcasting)obj; //downcasting
		obj2.multiply();
	} 

}
