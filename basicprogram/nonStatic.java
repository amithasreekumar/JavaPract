package basicprogram;

public class nonStatic {
	
	public static void main (String[] args) {
	
		nonStatic n1= new nonStatic();
		n1.add();
		n1.subtract();
	}
	
	void add() {  //nonstatic method
		System.out.println("nonstatic method ");
		
	}
	void subtract () {
		System.out.println("nonstatic method 2 ");
	}


}
