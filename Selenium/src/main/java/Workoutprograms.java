import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Workoutprograms {
	
	
  
		public void getdup(String str) {
			
			char[] ch = str.toCharArray();
			Map<Character,Integer> baseMap = new HashMap<Character,Integer>();
			for(char ch1 : ch) {
				if(baseMap.containsKey(ch1)) {
					baseMap.put(ch1, baseMap.get(ch1)+1);
					System.out.println(ch1);
				}
				else {
					
					baseMap.put(ch1, 1);
				}
				
			}
			
			
	
		
	}
	
	public static void main(String[] args) {
		
		
		Workoutprograms obj = new Workoutprograms();
		obj.getdup("Infosys Limited");
		
		
		
		//Duplicate Chars Remove
		
		
	
		
		
		//Hcl, Cts, Infosys - print
		
		/*String[] a = {"Hcl","Cts","Infosys"};
		
		int aa = a.length;
		
	    for(int i=aa-1;i>=0;i--) {
	    	
	    	System.out.println(a[i]);
	    }*/
		
		
		
		//Amazon India Private Limited - Unique Char Print
		
		
		/*String str = "Amazon India Private Limited";
		
		char[] ch = str.toCharArray();
		
		Set<Character> name = new HashSet<Character>();
		
		for(char ch1 : ch) {
			name.add(ch1);
		}
		
		
		StringBuilder sc = new StringBuilder();
		for(Character chars : name) {
			sc.append(chars);
		}
		
		System.out.println(sc.toString());*/
		
		
		
		
		
		

		
		/*String str = "Amazon India Private Limited";
		
		char[] ch = str.toCharArray();
		
		Set<Character> name = new HashSet<Character>();
		
		for(char ch1 : ch) {
			name.add(ch1);
		}
		
		StringBuilder sc = new StringBuilder();
		for(Character chars : name) {
			sc.append(chars);
		}
		
		System.out.println(sc.toString());*/
	}



}
