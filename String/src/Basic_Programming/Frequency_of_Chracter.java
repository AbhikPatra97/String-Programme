package Basic_Programming;

public class Frequency_of_Chracter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="Java is a programming language";
		int count=0;
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)=='a') {
				count++;
			}
		}
		System.out.println("No of 'a' is "+count);
	}

}
