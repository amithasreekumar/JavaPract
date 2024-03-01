package thisProgram;

public class ThisCallingStatement {
	
	ThisCallingStatement(){
		this(100);
		System.out.println("cons 1");
	}
	ThisCallingStatement(int a){
		this("amitha");
		System.out.println("cons 2 ");
	}
	ThisCallingStatement(String b){
		this('a');
		System.out.println("cons 3 ");
	}
	ThisCallingStatement(char c){
		System.out.println("cons 4");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	 new ThisCallingStatement();
	
	}

}
