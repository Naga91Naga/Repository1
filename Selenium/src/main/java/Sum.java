
public class Sum {
	
	int a=0,b=0,c=0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	/*	int[] a = {1,5,4,6};
		
		int b=0;
		
		for (int i=0;i<a.length;i++) {
			
			//System.out.println(a[i]);
			
			b = b + a[i];
		}
		
		System.out.println(b);

	}*/
		
		int a = 1546;
		String b = String.valueOf(a);
			int c = 0;
			for(int i=0;i<b.length();i++) {
				
				int j = Character.digit(b.charAt(i), 10);
				
				//System.out.println(j);
				
				 c = c + j;
			}
			
			System.out.println(c);
		}

}