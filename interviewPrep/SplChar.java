package interviewPrep;

public class SplChar {

	public static void main(String[] args) {
		String word="hello world 2024 :):*";
		
		char c1[]=word.toCharArray();
		int noOfAlp=0;
		int noOfNum=0;
		int noOfSpc=0;
		int noOfSplchr=0;
		
		for(int i=0;i<word.length();i++) {
			
			if(Character.isAlphabetic(c1[i])) {
				noOfAlp++;
			}else if(Character.isDigit(c1[i])) {
				noOfNum++;
			}else if(Character.isSpace(c1[i])) {
				noOfSpc++;
			}else {
				noOfSplchr++;
			}
		}
		System.out.println("num of Alphabets "+noOfAlp);
		System.out.println("num of Numbers "+noOfNum);
		System.out.println("num of Spaces "+noOfSpc);
		System.out.println("num of Spl characters "+noOfSplchr);
		
		
	}

}
