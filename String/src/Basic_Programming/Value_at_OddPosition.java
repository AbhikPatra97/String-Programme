package Basic_Programming;

public class Value_at_OddPosition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="Java is a programming language";
		for(int i=0;i<s.length();i++) {
			if(i%2!=0) {
				if(s.charAt(i)!=' ') {
					System.out.println("Value at "+i+ " is "+ s.charAt(i));
				}
			}
		}

	}
}