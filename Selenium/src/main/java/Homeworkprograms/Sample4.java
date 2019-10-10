package Homeworkprograms;

public class Sample4 {
	
	
	final static int No_of_chars=256;
	
	static char findarr(String str) {
		
		//count number of occurences for every character
		
		int[]count = new int[No_of_chars];
		
		for(int i=0;i<str.length();i++)
			
			(count[str.charAt(i)])++;
		
		//Find Second Highest Element
		
		int first=0,second=0;
		
		for(int i=0;i<No_of_chars;i++)
		{
			
			//Current element is smaller then first then update first and second
			
			if(count[i] > count[first]) {
				
				second = first;
				
				first = i;
			}
			
			//if count i is inbetween first and second and update second
			
			else if(count[i] > count[second] && count[i] != count[first]) {
				
				second=i;
			}
			
		}
		
		return (char) second;
		
		
	}
	
	public static void main(String[] args) {
		
		String str = "PayPal India";
		
		char res = findarr(str);
		
		if(res != '0') {
			
			System.out.println("Output: " +res);
		}
		
	}

}
