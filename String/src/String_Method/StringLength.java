package String_Method;

public class StringLength {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="abhik patra";
		
		System.out.println("Find Out String Length Using In-Built Method   "+s.length());
		
		s=s.concat("\0");
		char a[]=s.toCharArray();
		int i=0;
		int count=0;
		while(a[i]!='\0') {
			i++;
			count++;
		}
		System.out.println("String Length Using Coding  "+count);

	}

}
