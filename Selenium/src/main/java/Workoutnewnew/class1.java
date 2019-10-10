package Workoutnewnew;

public class class1 implements interface1{

	public int add(int a, int b) {
		// TODO Auto-generated method stub
		return a+b;
	}

	public int sub(int a,int b) {
		// TODO Auto-generated method stub
		return a-b;
	}

	public int mul(int a,int b){
		// TODO Auto-generated method stub
		return a*b;
	}

	public int div(int a,int b) {
		// TODO Auto-generated method stub
		return a/b;
	}

	public static void main(String[] args) {
		
		class1 obj = new class1();
		System.out.println(obj.add(10, 20));
		System.out.println(obj.sub(20, 10));
		
		
	}
	

}
