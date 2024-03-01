package basicprogram;
abstract class AmazonLogic
{
		abstract void login(); //overridden
}
public class Class21 extends  AmazonLogic
{
	public static void main(String[] args)
	{
		Class21 a1=new Class21();
		a1.login();
	}
	void login()
	{
		System.out.println("The Real Logic");
	}

}
