package Basic_Programming;


public class First_Last_Letter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="Java is a programming language";
		String a="java";
		System.out.println("Length of string-a(java) is  "+a.length());
		char ch1=s.charAt(0);
		char ch_last=s.charAt(s.length()-1);
		System.out.println("First Letter of the String is :: "+ch1);
		System.out.println("Last Letter of the String is  :: "+ch_last);
	}

}
