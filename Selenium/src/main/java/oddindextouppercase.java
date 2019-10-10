
public class oddindextouppercase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//String x = jTextField1.getText();
		
		
		
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
