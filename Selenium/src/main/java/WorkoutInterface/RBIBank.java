package WorkoutInterface;

public class RBIBank implements UsBank,NZBank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	   RBIBank obj = new RBIBank();
	   obj.goldloan();
	   obj.carloan();
	   obj.homeloan();
	   obj.debit();
	   obj.credit();
	   obj.visa();

	}

	public void goldloan() {
		// TODO Auto-generated method stub
		
		System.out.println("goldloan");
		
	}

	public void carloan() {
		// TODO Auto-generated method stub
		System.out.println("carloan");
	}

	public void homeloan() {
		// TODO Auto-generated method stub
		System.out.println("homeloan");
	}

	public void debit() {
		// TODO Auto-generated method stub
		System.out.println("debit");
	}

	public void credit() {
		// TODO Auto-generated method stub
		System.out.println("credit");
	}

	public void visa() {
		// TODO Auto-generated method stub
		System.out.println("visa");
	}

}
