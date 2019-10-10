package Homeworkprograms;

public class EvennumbersCaps {
	
	public static void main(String[] args) {
		
		
		//Write a java program and to change all odd index in to Uppercase :
		
//	  String x = "changeme";
//	  
//	  int len = x.length();
//	  
//	  //System.out.println(aa);
//	  
//	  for(int i=0;i<len;i++) {
//		  
//		  char ch = x.charAt(i);
//		  
//		  if(i%2 == 0) {
//			  
//			  System.out.println(Character.toLowerCase(ch));
//		  }
//		  
//		  else {
//			  
//			  System.out.println(ch);
//		  }
//		  
//	  }
		
		String x = "changeme";
		int len = x.length();
		
		for (int i = 0; i < len; i++) {
		    char ch = x.charAt(i);
		    if (i % 2 == 0) {
		    	
		        System.out.print(Character.toLowerCase(ch));
		    } else {
		        System.out.print(Character.toUpperCase(ch));
		    }
		}
		//System.out.println();
		
	}


	  
	}
		
	


