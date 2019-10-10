
public class cals2 extends calcs1{

	public int mul(int a, int b) {
		
		return a*b;
	}
	
	public int div(int a,int b) {
		
		return a/b;
	}
	
	public static void main(String[] args) {
		
		
		calcs1 obj = new calcs1();
		System.out.println(obj.add(10, 20));
		System.out.println(obj.sub(10, 20));
	    
		cals2 obj2 = new cals2();
		System.out.println(obj2.mul(10, 20));
		System.out.println(obj2.div(20, 10));
		System.out.println(obj.add(100, 5));
		System.out.println(obj.sub(100, 50));
		
		
		
		
	}
	
}
