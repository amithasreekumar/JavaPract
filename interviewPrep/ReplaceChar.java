package interviewPrep;

public class ReplaceChar {

	public static void main(String[] args) {
		String name="anitha";
		String a=name.replace('n', 'm');
		
		System.out.println(a);
		
		String FullName="Amitha Sreekumar";
		String b=FullName.replaceAll("Amitha", "");
		
		System.out.println(b);
		System.out.println(a+b);

	}

}
