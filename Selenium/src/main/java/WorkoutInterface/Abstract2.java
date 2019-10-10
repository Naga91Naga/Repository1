package WorkoutInterface;

public class Abstract2 extends  AbstractWorkout1{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		AbstractWorkout1 objnewone = new Abstract2();
		objnewone.data();
		objnewone.dataone();
		//objnewone.newdata;
		
	}

	@Override
	void data() {
		// TODO Auto-generated method stub
		
		System.out.println("Output Data:");
		
	}

}
