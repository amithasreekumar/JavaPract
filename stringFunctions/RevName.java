package stringFunctions;

public class RevName {

	public static void main(String[] args) {
		
		String name= "Madam";
		String output="";
		for(int i=name.length()-1;i>=0;i--) {
			output=output+name.charAt(i);
			//System.out.println(name.charAt(i));
		}
		
		System.out.println(output);
		if (output.equalsIgnoreCase(name)) {
			System.out.println(name+ " is a paliandrom");
		}else {
			System.out.println(name+ " is not a paliandrom");
		}
		
		
		
	}

}
