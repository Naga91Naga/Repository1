package Constructor;

public class ConstructorSampleProgram2new {

	
	int modelyear;
	String modelname;
	
	
	public ConstructorSampleProgram2new(int year, String name) {
		modelname = name;
		modelyear = year;
	
	}
	
	public static void main(String[] args) {
		ConstructorSampleProgram2new obj = new ConstructorSampleProgram2new(1991,"New");
		System.out.println(obj.modelname +" "+ obj.modelyear );
		
	}
	
	
	
	
}
