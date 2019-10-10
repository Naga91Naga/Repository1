package WorkoutInterfacenew;

public class man extends mantwo implements Interfaceone,InterfaceTwo {
	
	
	

	public void gold() {
		// TODO Auto-generated method stub
		
		System.out.println("gold");
		
	}

	public void silver() {
		// TODO Auto-generated method stub
		System.out.println("Silver");
	}

	public void food() {
		// TODO Auto-generated method stub
		System.out.println("food");
	}

	public void water() {
		// TODO Auto-generated method stub
		System.out.println("water");
	}
	
	public static void main(String[] args) {
		
		man obj = new man();
		obj.gold();
		obj.silver();
		obj.food();
		obj.water();
		obj.fs();
		obj.fsone();
		obj.success();
		obj.trying();
	
		
	}
	

}
