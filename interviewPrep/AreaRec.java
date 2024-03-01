package interviewPrep;

import java.util.Scanner;

public class AreaRec {

	public static void main(String[] args) {
		int side[]=new int[4];
		int area=1;
		System.out.println("give for sides of rectangle");
		Scanner s1=new Scanner(System.in);
		for(int i=0;i<side.length;i++) {
			side[i]=s1.nextInt();
			area=area*side[i];
		}
		System.out.println(area);
		

	}

}
