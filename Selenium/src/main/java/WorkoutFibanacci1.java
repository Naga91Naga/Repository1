
public class WorkoutFibanacci1 {

	public static void main(String[] args) {
		
		int a=0,b=1,c,count=20;
		
		for(int i=0;i<count;i++) {
			
			c=a+b;
			System.out.println("Output:" +c);
			a=b;
			b=c;
		}
		
	}
	
}
