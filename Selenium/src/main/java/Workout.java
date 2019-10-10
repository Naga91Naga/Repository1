
public class Workout {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*String x = "changename";
		
		int len = x.length();
		
		for(int i=0;i<len;i++) {
			
			char ch = x.charAt(i);
			
			if(i%2 == 0) {
				
				System.out.print(Character.toLowerCase(ch));
			
				
			}
			else {
				System.out.print(Character.toUpperCase(ch));
				
			}
		
		}*/
		

/*int in = 150;
int rem = 0;
int sum = 0;
while(in>0){
rem = in % 10;
sum = sum + rem;
in = in/10;

}
System.out.println(sum);*/
		
		/*String string = "I am a Software Tester";
		int len = string.length();
		for(int i=0;i<len;i++) {
		String reverse = new StringBuffer(string).reverse().toString();
		System.out.println(reverse);
	}*/
		
		
	String str = "I am a Software Tester";
	
  
	
	String[] str2 = str.split(" ");
	
	int len = str2.length;
	    
	    System.out.println(len);
	
	for(int i=0;i<len;i++) {
		
		if(i%2!=0) {
			
			String reverse = new StringBuffer(str2[i]).reverse().toString();
			System.out.print(reverse +" ");
		}
		
		
		else  {
			System.out.print(str2[i] + " ");
			
		}
		
		
		
	}
	
		
		
		
		
	}
}
