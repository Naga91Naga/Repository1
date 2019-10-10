
public class sampleworkout1 {
	
	
	//print welcome to css scorp
	
	//count and vowels in welcome to css scorp
	
	
	public static void main(String[] args) {
		
		
		String str = "Welcome to css scorp";
		
		int vowels=0,consonants=0;
		
		for(int i=0;i<str.length();i++) {
			
			char ch = str.charAt(i);
			
			if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u') {
				
				System.out.println("vowels Output: " +ch);
				
				vowels++;
				
			
				
			}
			
			else if(ch>='a' && ch<='z') {
				
			System.out.println("consonants output:" +ch);
				
		     consonants++;
				
				
			}
			
		}
		
		System.out.println("Total vowels: " +vowels);
		
		System.out.println("Total Consonants: " +consonants);
		
	}
	
	

}
