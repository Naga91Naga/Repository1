
public class FibanacciProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a=0,b=1,count=10,c;
		
		for(int i=2;i<10;i++) {
			
			c=a+b;
			System.out.println(c);
			a=b;
			b=c;
			
		}
		
		
	}

}
