
public class overloadingandriding2 extends Overloadingandriding{
	
	public char character(char ch) {
		
		return ch;
	}
	
	public int number1(int num11) {
		return num11;
	}
	
	
	
	public static void main(String[] args) {
		
		
		overloadingandriding2 obj = new overloadingandriding2();
		System.out.println(obj.number1(10));
		System.out.println(obj.name1("Arjun"));
		System.out.println(obj.charact('a'));
		System.out.println(obj.character('b'));
		System.out.println(obj.number1(11));
//		overloadingandriding2 obj = new overloadingandriding2();
//	    obj.character('a');
//	    obj.number1(10);
//	    
//	    
//	    Overloadingandriding obj2 = new Overloadingandriding();
//	    obj2.name1("name");
//	    obj2.number1(10);
	    
	}
	

}
