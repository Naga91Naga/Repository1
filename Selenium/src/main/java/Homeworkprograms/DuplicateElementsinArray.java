package Homeworkprograms;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class DuplicateElementsinArray {
	
	
	public static void findduplicatesarray(int[] inputarray) {
		
		LinkedHashMap<Integer,Integer> map = new LinkedHashMap<Integer,Integer>();
		
		for( int d : inputarray) {
			
			if(map.get(d)==null) {
				
				map.put(d, 1);
			}
			
			else {
				
				map.put(d, map.get(d)+1);
			}
			
			
		}
		
		
	
	
	Set<Entry<Integer,Integer>> entryset = map.entrySet();
	
	for(Entry<Integer,Integer> entry : entryset) {
		   System.out.println("Duplicate Element : "+entry.getKey()+" - found "+entry.getValue()+" times.");
		
	}
	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] inputarray = new int[] {1,2,1,22,23,34,44,33,34,22,1,34};
		
		findduplicatesarray(inputarray);
		
	}

}
