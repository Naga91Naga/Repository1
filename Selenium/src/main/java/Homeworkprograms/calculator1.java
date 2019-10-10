package Homeworkprograms;

public class calculator1 {
	
	public int sum(int a,int b) {
		
		return a+b;
	}
	
	public int sub(int a,int b) {
		
		return a-b;
	}
	

	public static void main(String[] args) {
		
		calculator2 obj = new calculator2();
		
		System.out.println(obj.sum(10, 20));
	}
	
	
}
