package stringFunctions;

import java.util.Date;

public class StringDateFunctions {
	

	public static void main(String[] args) {
		
		Date d1=new Date();//current time in epoch
		System.out.println(d1.getTime());
		/*Date d2=new Date(d1.getTime()); //current time in human readable format
		System.out.println(d2);
		Date d3=new Date(d1.getTime()+(1000*60*60*24*5));//future time
		System.out.println(d3);*/
	}

}
