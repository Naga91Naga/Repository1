package Homeworkprograms;

public class workout2 {
	
	//Second Repeating Character
	
	
	static final int NO_of_chars=256;
	
	
	
	static char findarr(String str) {
		
		int[] count = new int[NO_of_chars];
		
		for(int i=0;i<str.length();i++) 
			
			
		 (count[str.charAt(i)])++; 
		int first=0,second=0;
		
		for(int i=0;i<NO_of_chars;i++) {
			
			if(count[i]>count[first]) {
				
				second=first;
				first=i;
			}
			
			else if(count[i]>count[second] && count[i] != count[first]) {
				
				second = i;
				
				
			}
		}
		return (char) second;
		}
		
		
	

	
	public static void main(String[] args) {
		
		String str = "PayPal India";
		
		char res = findarr(str);
		
		 if (res != '\0') 
	         System.out.println("Second most frequent char"+ 
	                                       " is " + res); 
		
	}
	

}
