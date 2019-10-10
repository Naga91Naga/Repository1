package Homeworkprograms;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Sample {
	
	public static void main(String[] args) {
		
		LinkedHashMap<String,Integer> map = new LinkedHashMap<String,Integer>();
		
		map.put("Arjun", 28);
		
		map.put("Vino", 25);
		
		map.put("Sasi", 31);
		
		map.put("Dinesh", 34);
		
		
		System.out.println(map.size());
		
		if(map.containsKey("Arjun")) {
			
			Integer a = map.get("Arjun");
			
			//Integer b = map.get(a);
			
			System.out.println("Output  " +a);
		}
		
		map.clear();
		print(map);
	 	
	}
	//public static void print(Map<String,Integer> map)
	
	public static void print(Map<String,Integer> map)
	{
		
		if(map.isEmpty()) {
			System.out.println("map is empty");
		}
		
		else {
			System.out.println(map);
		}
	}
}
