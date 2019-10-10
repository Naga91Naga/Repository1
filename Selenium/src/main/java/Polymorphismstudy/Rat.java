package Polymorphismstudy;

public class Rat {
	
	public void animalsound() {
		System.out.println("Roor");
	}
	
	public static void main(String[] args) {
		
		Rat obj = new Rat();
		Cat obj2 = new Cat();
		Animal obj3 = new Animal();
		obj.animalsound();
		obj2.animalsound();
		obj3.animalsound();
	}

}
