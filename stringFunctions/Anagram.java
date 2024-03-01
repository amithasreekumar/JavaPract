package stringFunctions;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args)
	{
	String a1="smlent";
	String a3="listen";
if(a1.length()!=a3.length())
{
	System.out.println("They are not anagram at all");
}
else
{
				char c1[]=	a1.toCharArray();
				//s,i,l,e,n,t
				Arrays.sort(c1);
				char c2[]=	a3.toCharArray();
				//l,i,s,t,e,n
				Arrays.sort(c2);
				System.out.println(Arrays.toString(c1));				
				System.out.println(Arrays.toString(c2));
				//Arrays.equals(args, args)
			if((	Arrays.equals(c1, c2)==true))
			{
				System.out.println("The given 2 strings are anagram of each other");
			}
			else
			{
				System.out.println("The given 2 strings not anagram of each other");
			}
			
}
	//Arrays.equals(args, args)
		
	}

}
