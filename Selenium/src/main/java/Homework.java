import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class Homework {
	
	
	public static void main(String[] args) {
		
		
		
	
		
		
		// TODO Auto-generated method stub

		//Print Unique Characters in String :

		//Paypal India

		//ylindi
		
		//Set<Character> ch = new LinkedHashSet<Character>();
		
		String str = new String("Paypal India");
		
		
		Set <Character> letters = new  HashSet<Character>();
		
		for(int i=0;i<str.length();i++) {
			
			letters.add(str.charAt(i));
		}
		System.out.println(letters);
		
	}

	
}
