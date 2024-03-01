package arrayProg;

import java.util.Arrays;
import java.util.Scanner;

public class ScannerValue {

	public static void main(String[] args) {
		 
		int rollnum[]= new int[4];
		Scanner scanObj= new Scanner(System.in);
		for(int i=0;i<4;i++) {
		System.out.println("Pass number");
		rollnum[i]=scanObj.nextInt();
		
		}
		System.out.println(Arrays.toString(rollnum));
		
	}

}
