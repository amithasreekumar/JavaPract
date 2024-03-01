//Use super keyword for method over riding
package Super;

class ParentMethOverRiding {
	 void add() {
		int a=10;
		int b=20;
		int c= a+b;
		System.out.println(c);
	}
}

public class ChildMethOverRiding extends ParentMethOverRiding {
	 void add() {
		int a=150;
		int b=220;
		int c= a+b;
		System.out.println(c);
	}

	public static void main(String[] args) {
		ChildMethOverRiding obj=new ChildMethOverRiding();
		obj.add();
	}

}
