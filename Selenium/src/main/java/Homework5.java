import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class Homework5 {
	
	
		

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
		String string = "Amazon india private limited";

		char[] chars = string.toCharArray();
		Set<Character> charSet = new LinkedHashSet<Character>();
		for (char c : chars) {
		    charSet.add(c);	    
		}

	StringBuilder sb = new StringBuilder();
	for (Character character : charSet) {
	    sb.append(character);
	}
	
	
	System.out.println(sb);
//	System.out.println(sb.toString());
	

		
	}

}
