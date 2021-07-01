package Programming;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String x="He is Aradhya";
		String y="Is he Hardya";
	// All the character from 'x' is used to 'y':=>Anagram
		
		x=x.replace(" ","");
		y=y.replace(" ","");
		
		x=x.toLowerCase();
		y=y.toLowerCase();
		
		char[] a=x.toCharArray();
		char[] b=y.toCharArray();
		
		Arrays.sort(a);
		Arrays.sort(b);
		
		Boolean result=Arrays.equals(a,b);
		if(result==true)
			System.out.println("It is Anagram");
		else
			System.out.println("It is not Anagram");

	}

}
