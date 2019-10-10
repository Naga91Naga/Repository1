package InheritanceStudy;

public class secondclass extends firstclass {

	public void study() {
		System.out.println("Book");
	}
	
	public void sports() {
		System.out.println("cricket");
	}
	
	public int number(int no) {
		return no;
	}
	
	public float fvalue(float fvalue) {
		return fvalue;
	}
	
	public char charval(char val) {
		return val;
	}
	
	public boolean bol(boolean bl) {
		return bl;
	}
	
	public static void main(String[] args) {
		
		secondclass obj = new secondclass();
		obj.age();
		obj.chrr();
		obj.name();
		obj.study();
		obj.sports();
		System.out.println(obj.number(20));
		System.out.println(obj.fvalue(0.2f));
		System.out.println(obj.charval('a'));
		System.out.println(obj.bol(false));
	}
	
}
