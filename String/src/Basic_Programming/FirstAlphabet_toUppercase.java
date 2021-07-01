package Basic_Programming;

public class FirstAlphabet_toUppercase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="Java is a programming language";
		String s1=s.substring(0,4).toUpperCase()+s.substring(4);
		System.out.println(s1);
	}

}
