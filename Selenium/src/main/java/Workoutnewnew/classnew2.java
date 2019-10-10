package Workoutnewnew;

public class classnew2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Css Scorp Print Vowels,Consonants Count
		
		String input = "Welcome To Css Scorp";
		
		int consonants = 0, vowels = 0, sum=0;
		
		
		
		input = input.toLowerCase();
		
		for(int i=0;i<input.length();i++) {
			
			char ch = input.charAt(i);
			
			System.out.println(ch);
			
			if(ch == 'a' || ch == 'e' || ch == 'i' || ch=='o' || ch == 'u') {
				consonants++;
			}
			
			else if ((ch>= 'a' && ch<='z')){
				
				vowels++;
			}
		}
		
			System.out.println(consonants);
			System.out.println(vowels);
			
		}
		
		
		
		
		

	}


