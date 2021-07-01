package Programming;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String x="abhik patra";
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
	}

}
