package Homeworkprograms;

public class Sample5 {
	
	
	static final int No_of_chars = 256;
	
	public static char findarr(String str) {
		
		int[] count = new int[No_of_chars];
		
		for(int i=0;i<str.length();i++)
		
		(count[str.charAt(i)])++;
		
		
		//Compare the Value
		
		int first=0,second=0;
		
		for(int i=0;i<No_of_chars;i++) {
			
			if(count[i] > count[first]) {
				
				second=first;
				first=i;
			}
			
			
			else if(count[i] > count[second]  && count[i] != count[first]) {
				
			second = i;
			
			}
		}
		
		return (char) second;
		
	}
	
	
	public static void main(String[] args) {
		
		String str = "PayPal India";
		
		char res = findarr(str);
		
		if(res != 0) {
			
			System.out.println("Output:  " +res);
		}
		
	}
	

}
