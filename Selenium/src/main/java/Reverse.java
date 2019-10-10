
public class Reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String a = "I am a software Tester";
		
		char[] b = a.toCharArray();
		
		for(int i=0;i<b.length;i++) {
			
			
			if(i == 2 ) {
				System.out.println('m');
			}
			else if(i == 3) {
				
				System.out.println('a');
			}
          else if(i == 7) {
				
				System.out.println('e');
			}
            else if(i == 8) {
				
				System.out.println('r');
			}
            else if(i == 9) {
	
	           System.out.println('a');
                  }
             else if(i == 10) {
	
	           System.out.println('w');
                      }
            else if(i == 11) {
	
	                System.out.println('t');
                       }
                  else if(i == 12) {
	
	            System.out.println('f');
                             }
                    else if(i == 13) {
	
	              System.out.println('o');
                         }
                   else if(i == 14) {
	
	               System.out.println('s');
                          }		
                         else  {
		            	System.out.println(b[i]);
		
		                    }
		 
		
		}
		
	}

}
