package Homeworkprograms;

public class CssScorpVowelsandConsonants {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Print the Welcome to Css Scorp Vowels and Consonant Count
		
		
		String a = "Welcome To Css Scorp";
		
		int vcount=0,ccount=0;
		
		int aa = a.length();
		
		for(int i=0;i<aa;i++) {
			
		char ch = a.charAt(i);
		
		if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' || ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U') {
			
		 // System.out.println("Vowels:  "+ch);
			
			vcount++;
			
		}
		
		else if((ch>='a' && ch<='z')) {
			
			System.out.println("Consonants:  " +ch);
			
			ccount++;
		}
		
		
//           else  {
//			
//			System.out.println("Consonants:  " +ch);
//			
//			ccount++;
//		}
			
		}
		
		System.out.println("Output:" +vcount);
		
		System.out.println("Output:" +ccount);

	}

}
