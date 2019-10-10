package Homeworkprograms;

public class Workoutsecond {
	
	static final int No_Of_chars=256;
	
	static char findarr(String str) {
		
		//count no of occurences character
		
		int[] count = new int[No_Of_chars];
		
	    for(int i=0;i<str.length();i++)
	    	
	    (count[str.charAt(i)])++;
	    
	    //Second Highest Element
	    
	    int first=0,second=0;
	    
	    for(int i=0;i<No_Of_chars;i++) {
	    	
	    	if(count[i]>count[first]) {
	    		
	    		second = first;
	    		
	    		first = i;
	    	}
	    	
	    	
	    	
	    	else if(count[i] > count[second] && count[i] != count[first]) {
	    		
	    		second=i;
	    	}
	    }
	    
		return (char) second;
	    
	}
	
	public static void main(String[] args) {
		
		
		String str = "PayPal India";
		char res = findarr(str);
		if(res!='0') {
			
			System.out.println("O/p: " +res);
		}
	}

}
