package Newpackage;

public class ArrayWorksheet {

	public static void main(String[] args) {
		
		/* int Array
		
		int[] name = {10,20,30,40};
		
		System.out.println("Output is : " +name[3]); */
		
		/*String Array
		String[] name = {"Arjun","Bala","Sasi","Rekha"};
		
		System.out.println("Name is :" +name[3]);*/
		
		/*Print Using For Loop :
		
		int[] name = {10,20,30,40};
        
		for(int i:name) {
			System.out.println(i);
		} */
		
		
		int count=0;
		int[] name = {10,20,30,40};
		for(int i=0;i<name.length;i++) {
			
			System.out.println("The Output Of name is["+i+"] : " +i);
		}
		
	}
}
