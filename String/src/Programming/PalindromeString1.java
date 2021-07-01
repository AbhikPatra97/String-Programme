package Programming;

public class PalindromeString1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String x="levek";
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
		
		for(int j=0;j<y.length;j++) {
			if(a[j]==y[j])
				System.out.println("Palindrome String");
			else
				System.out.println("Not Palindrome String");
		}
	}
}