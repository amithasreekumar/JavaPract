package arrayProg;

import java.util.Arrays;

public class copyArray {

	public static void main(String[] args) {
		int a[]=new int[3];
		
		a[0]=23;
		a[1]=56;
		a[2]=84;
		int b[]=new int[a.length];
		
		for(int i=0;i<a.length;i++) {
			b[i]=a[i];
			
		}
		System.out.println(Arrays.toString(a));
		System.out.println(Arrays.toString(b));


	}

}
