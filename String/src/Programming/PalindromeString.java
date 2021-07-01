package Programming;

public class PalindromeString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String x="level";
		char y[]=x.toCharArray();
		char a[]=new char[y.length];
		int i=0;
		while(i<y.length) {
			a[y.length-1-i]=y[i];
			i++;
		}
		System.out.println("Actual Value   = "+x);
		System.out.print("Reversed Value = ");
		System.out.println(a);
		
		
		i=0;
		while(i<y.length) {
			if(a[i]!=y[i]) {
				System.out.println("Not palindrome");
				System.exit(0);
			}
			else {
				++i;
				continue;
			}
				
		}
		System.out.println("palindrome String");
	}
}
