import java.util.LinkedHashSet;
import java.util.Set;

public class Prog {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	


			String string = "PayPal Indiaa";

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
			// System.out.println(sb.toString());
		

	}

}
