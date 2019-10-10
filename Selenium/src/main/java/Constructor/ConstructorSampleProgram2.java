package Constructor;

public class ConstructorSampleProgram2 {

	int x;
	static String z="Arjun";
	static char a = 'z';
	
	public ConstructorSampleProgram2(int y,String z, char a) {
		
	      x=y;
	    
	}
	
	public static void main(String[] args) {
		
		ConstructorSampleProgram2 obj = new ConstructorSampleProgram2(5,z,a);
		System.out.println((obj.x));
		System.out.println((obj.z));
		System.out.println((obj.a));
	}
	
	
}
