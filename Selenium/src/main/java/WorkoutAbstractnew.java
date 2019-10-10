
public class WorkoutAbstractnew extends WorkoutAbstract{

	public static void main(String[] args) {
		
		WorkoutAbstract obj = new WorkoutAbstractnew();
		obj.name();
		obj.age();
		obj.number();
		obj.rollnumber();
		obj.staticdataone();
		obj.staticdatatwo();
		obj.employees(101);
		System.out.print(obj.employees(101));
		System.out.println(obj.emp3(5.99f));
		System.out.println(obj.employees2("true"));
		System.out.println(obj.emp4('D'));
		System.out.println(obj.emp6(21));
		//System.out.println(obj.emp5(2));
		System.out.println(obj.emp6(21));
		
		
		//System.out.println(obj.min);
	    System.out.println(obj.min);
		
	}

	@Override
	void name() {
		// TODO Auto-generated method stub
		System.out.println("Arjun");
	}

	@Override
	void age() {
		// TODO Auto-generated method stub
		System.out.println("28	");
	}

	@Override
	void number() {
		// TODO Auto-generated method stub
		System.out.println("9626485881");
	}

	@Override
	void rollnumber() {
		// TODO Auto-generated method stub
		System.out.println("28419543");
	}
	
}
