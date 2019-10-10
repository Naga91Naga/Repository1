import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class CollectionConcepts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//collection - Dynamic Array 
		
		
		//List,Set,Map
		
		/*List<String> name = new ArrayList<String>();
		
		name.add("Arjun");
		name.add("Vino");
		
		for(String name1 : name) {
			
			System.out.println(name1);
		}*/
		
	/*	List<Integer> num = new LinkedList<Integer>();
		num.add(1);
		num.add(2);
		num.add(3);
		num.add(4);
		
		for(int num1 : num) {
			System.out.println(num1);
		}*/
		
		/*Set<String> name = new TreeSet<String>();
		name.add("Arjun");
		name.add("Bala");
		name.add("Arjun1");
		name.add("Bala1");
		for(String name1 : name) {
			System.out.println(name1);
		}*/
		
		//Map - Two Dimesional Array
		
        Map<Integer,String> name = new HashMap<Integer,String>();
        
        name.put(100, "Arjun");
        name.put(101, "Vino");
        name.put(102, "Arjun1");
        name.put(103, "Vino2");
        name.put(102, "Arjun11");
        name.put(103, "Vino11");
        
        System.out.println(name.get(103));
        
        for(Map.Entry<Integer, String> me : name.entrySet()) {
        	
        	System.out.println(me);
        }
        
        
        
		
		

	}

}
