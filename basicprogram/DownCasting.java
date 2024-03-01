package basicprogram;
class grate_gp{
	void add() {
		System.out.println("add");
	}
}

class g_parent1 extends grate_gp{
	void sub() {
		System.out.println("sub");
	}
}

class parent1 extends g_parent1{
	void multi() {
		System.out.println("multi");
	}
}

public class DownCasting extends parent1 {
	
	void div() {
		System.out.println("div");
	}

	public static void main(String[] args) {
		grate_gp obj=new g_parent1();
		obj.add();
		
		g_parent1 obj2= new parent1();
		obj2.add();
		obj2.sub();
		
		
		parent1 obj3=(parent1) obj2;
		obj3.add();
		obj3.sub();
		obj3.multi();
		


	}

}
