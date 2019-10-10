package Homeworkprograms;

public class calculator2 extends calculator1{

	public int mul(int a,int b) {
		
		return a*b;
	}
	
	
	public int div(int a,int b) {
		
		return b/a;
	}
	
	
	public static void main(String[] args) {
		
		calculator1 obj1 = new calculator1();
		
		System.out.println(obj1.sum(10, 20));
		System.out.println(obj1.sub(20, 10));
	
		
		calculator2 obj = new calculator2();
		System.out.println(obj.sum(20, 10));
		System.out.println(obj.sub(10, 20));
		System.out.println(obj.mul(10, 20));
		System.out.println(obj.div(20, 10));
		
		
	}
	
}
