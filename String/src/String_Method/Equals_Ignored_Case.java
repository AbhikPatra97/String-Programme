package String_Method;

import java.util.ArrayList;

public class Equals_Ignored_Case {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a="Java is a computer language";
		
		ArrayList<String> list=new ArrayList<>();
		list.add("java");
		list.add("c");
		list.add("paython");
		
		for(String obj:list) {
			System.out.println(obj);
			if(obj.equalsIgnoreCase(a)) {
				System.out.println("JAVA word is present in ArrayList");
			}
		}
	}

}
