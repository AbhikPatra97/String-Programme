package Programming;

public class VowelConsonantSpecialCharacterCounting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a="Java is a omputer language";
		a=a.toUpperCase();
		char[] b=a.toCharArray();
		
		int i=0;
		int vowelCount=0;
		int consonantCount=0;
		int specialSymbolCount=0;
		while(i<b.length) {
			if(b[i]>'A' && b[i]<'Z') 
			{
				if(b[i]=='A'||b[i]=='E'||b[i]=='I'||b[i]=='O'||b[i]=='U') {
					vowelCount++;
							}
				else
					consonantCount++;
							}
			else {
				specialSymbolCount++;
			}
			i++;
		}
		System.out.println("Vowel count  ="+vowelCount);
		System.out.println("Consonant count  ="+consonantCount);
		System.out.println("Special symbol count  ="+specialSymbolCount);

	}
}
