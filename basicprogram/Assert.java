package basicprogram;

import java.util.Scanner;

public class Assert {

	public static void main(String[] args) {
		System.out.println("give input");
		Scanner s1=new Scanner(System.in);
		int input=s1.nextInt();
		assert input>10:"Assetion exception";
		int b=10;
		int c=input*10;
		System.out.println(c);
	}

}
