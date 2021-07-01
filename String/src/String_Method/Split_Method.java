package String_Method;

public class Split_Method {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a="java is a computer language";
		String[] spliting=a.split(" ",3);
		for(String obj:spliting) {
			System.out.println(obj);
		}
	}

}
