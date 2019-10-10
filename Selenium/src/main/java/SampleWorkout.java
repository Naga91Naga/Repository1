import java.util.LinkedHashMap;
import java.util.Map;

public class SampleWorkout {
	
	//Print Unique Chars in PayPal India
	
	public static void main(String[] args) {
		
		String s = "PayPalIndia";
		
		LinkedHashMap<Character,Integer> list = new LinkedHashMap<Character,Integer>();
		
		for(Character c : s.toCharArray()) {
			
			if(list.containsKey(c)) {
				
				list.put(c, list.get(c)+1);
			}
			
			else {
				
				list.put(c, 1);
			}
			
		}
			for(Map.Entry e : list.entrySet()) {
				
				if((Integer) e.getValue()==1) {
					
					System.out.println(e.getKey());
				}
				
			}
			
			
		}
		
		
		
	}
	
	

