package basicprogram;

public class ConOverloading {

	public static void main(String[] args) {

		ConOverloading a= new ConOverloading();
		new ConOverloading(9);
	}

	ConOverloading() //constructor 1
	{
System.out.println("no para");
	}
	ConOverloading(int a) //constructor 1
	{
		System.out.println("int para");
	}

}
