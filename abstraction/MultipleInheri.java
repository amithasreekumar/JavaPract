package abstraction;

interface one{
	void add();
	
}
interface two{
	void sub();
}
interface three{
	void multiply();
}

interface four{
	void div();
}

interface five{
	void modulus();
}


public class MultipleInheri implements one,two,three,four,five {

	public static void main(String[] args) {
		MultipleInheri obj= new MultipleInheri();
		obj.add();
		obj.div();
		obj.multiply();
		obj.sub();
		obj.modulus();
		
	}

	@Override
	public void modulus() {
		System.out.println("modulus");
		
	}

	@Override
	public void div() {
		System.out.println("div");		
	}

	@Override
	public void multiply() {
		System.out.println("multiply");		
	}

	@Override
	public void sub() {
		System.out.println("sub");		
	}

	@Override
	public void add() {
		System.out.println("add");		
	}

}
