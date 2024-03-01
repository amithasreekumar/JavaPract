// calling constructor in child class using super calling statement

package Super;

class GrandParentClass{
	GrandParentClass(){
		System.out.println("GrandParent constructor ");   // 6th  
	}
	
}

class ParentClass extends GrandParentClass{
	ParentClass(int a){                                  // 4th
		//called super() implicitly                   // 5th
		System.out.println("Parent constructor");   // 7th  
	}
	
}

public class ChildClass extends ParentClass  {
	
	ChildClass(){                                   // 2nd
		super(1); //called explicitly                // 3rd
		System.out.println("child constructor ");    // 8th 
	}

	public static void main(String[] args) {
		
		new ChildClass();//create obj of the child class	// 1st
		
	}

}
 