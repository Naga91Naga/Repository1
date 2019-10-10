import java.util.Scanner;

public class Dupnew {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Array Initiallization
		int[] arr = new int[20];
		
		int firstarr,Secondarr;
		int i;
		int temp;
	 
        //Create Scanner Object
		
		Scanner sc = new Scanner(System.in);
		
		//Display Array Size
		
		System.out.println("Enter the Array Size:");
		int arrinput = sc.nextInt();
		
		
		//Display Message For Array Elements
		
		System.out.println("Read Array Elements From User:");
		
		//Display the Array Elements
		
		for(i=0;i<arrinput;i++) {
			
			System.out.println("Array Elements are:" +i+ ":");
			arr[i] = sc.nextInt();
			
		}
		
		/* Display array before removing duplicate element */
		
		System.out.println("Before:");

		//Loop for array elements
		
		for(i=0;i<arrinput;i++) {
			
			System.out.println(arr[i]);
		}
		
		//Display Array after removing duplicate element
		
		System.out.println("After removing duplicate element array are :");
		
		for(firstarr=0;firstarr<arrinput;firstarr++) {
			
			for(Secondarr=firstarr+1;Secondarr<arrinput;Secondarr++) {
				
				if(arr[firstarr] == arr[Secondarr]) {
					
					for(temp=Secondarr; temp<arrinput; temp++) {
						
						arr[temp] = arr[temp+1];
					}
					
					arrinput = arrinput - 1;
					
				}
				
				
				else
					
					Secondarr++;
			}
		}
		
		
		//Loop to display array after removing dupicate element
		
		for(i=0;i<arrinput;i++) {
			System.out.println(arr[i]);
		}
		
		
	}

}
