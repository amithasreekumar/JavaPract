package interviewPrep;

public class RevName {

	public static void main(String[] args) {
		String name="amitha";
		String revname="";
		for(int i=name.length()-1;i>=0;i--) {
			revname=revname+name.charAt(i);
		}
		System.out.println(revname);

	}

}
