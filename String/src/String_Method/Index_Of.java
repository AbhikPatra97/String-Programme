package String_Method;

public class Index_Of {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="this is index of example";
		int index1=s.indexOf("is");   //here output is 2 : "is" is present in "this"
		int index2=s.indexOf("is",3);
		int index3=s.indexOf("index");
		int index4=s.indexOf("java");
		System.out.println(index1);  //here output is 2 : "is" is present in "this"
		System.out.println(index2);
		System.out.println(index3);
		System.out.println(index4);
	}

}
