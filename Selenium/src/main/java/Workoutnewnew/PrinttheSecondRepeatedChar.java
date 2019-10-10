package Workoutnewnew;



			import java.util.HashMap;
			import java.util.Map;

			public class PrinttheSecondRepeatedChar {

				public static void main(String[] args) {
				
					String value ="PayPalIndia";
					
					char[] charArray = value.toCharArray();
					
					HashMap<Character,Integer> map = new HashMap<Character,Integer>();
					
					for (char c : charArray) {
						
						if(map.containsKey(c)) {
							map.put(c, map.get(c)+1);
						}
						else {
							map.put(c, 1);
						}			
					}
					
					for (Map.Entry e:map.entrySet()) {
						if((Integer)e.getValue()>1){
							System.out.print(e.getKey());
						}
						
					}
					
					//System.out.println(map);	
					
				}

			
	
	
}
