package interviewPrep;

import java.util.Arrays;

public class NumOfChar {

	public static void main(String[] args) {
		
		String word="world is full of beautiful people";
		char num[]=word.toCharArray();
		int noOfAlp=0;
		
		for(int i=0;i<word.length();i++) {
			if(Character.isAlphabetic(num[i])) {
				noOfAlp++;	
			}
			
		}
		System.out.println("Number of alphabet = "+noOfAlp);
		Arrays.sort(num);
		System.out.println(Arrays.toString(num));
	}

}
