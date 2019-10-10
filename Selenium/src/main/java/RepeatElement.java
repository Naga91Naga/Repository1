import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

class RepeatElement 
{ 
    private static void findDuplicatesUsingHashMap(int[] inputArray)

    {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
         
        for (int c: inputArray) 
        {   
            if(map.get(c) == null)
            {
                map.put(c, 1);
            }
            else
            {
                map.put(c, map.get(c)+1);
            }
        }
         
        Set<Entry<Integer, Integer>> entrySet = map.entrySet();
         
        for (Entry<Integer, Integer> entry : entrySet) 
//        for(Map.Entry entry : map.entrySet()){
        {               
            if(entry.getValue() > 1)
            {
                System.out.println("Duplicate Element : "+entry.getKey()+" - found "+entry.getValue()+" times.");
            }
        }
    }
    
    public static void main(String[] args) {
    	
    	int[] inputArray = new int[] {111, 333, 555, 777, 333, 444, 555, 111, 555};
        
        System.out.println("======Duplicates Using Hash Map======");
         
        findDuplicatesUsingHashMap(inputArray);
    	
    	
    }
    
} 