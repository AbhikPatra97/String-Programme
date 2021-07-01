package Programming;

public class CopyStringIntoAnother {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String x="abhik patra";
		char y[]=x.toCharArray();
		char a[]=new char[y.length];
		int i=0;
		while(i<y.length) {
			a[i]=y[i];
			i++;
		}
		System.out.println("Actual Value = "+x);
		System.out.print("Copied Value = ");
		System.out.println(a);
		
	}

}
