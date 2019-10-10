package Newpackage;

public class Excep {
	
	
	
	
	public static void main(String[] args) {
		
	
		/*int a=10;
		
		if (a>11) {
			
			try {
				
				System.out.println("It is Succeed");
			}
			
			catch (Exception e) {
				System.out.println("It is Failed");
				
			}
			
			finally {
				
				System.out.println("The try catch is finished");
			}
		}
			
		else {
			
			System.out.println("Skipped");
		}*/
		
		
		try {
		int[] a  = {10,20,30,40};
		System.out.println(a[10]);
		} catch (Exception e) {
			
			System.out.println("Someting went wrong");
		}
		
		
		
		
		
	}

}
