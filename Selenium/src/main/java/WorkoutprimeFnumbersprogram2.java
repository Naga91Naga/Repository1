
public class WorkoutprimeFnumbersprogram2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Print Prime numbers
		
		int x = 2;
		while(x<=100) {
			int y = 2;
			while(y<=x) {
				
				if(x==y) {
					System.out.println(x);
				}
				if(x%y == 0) {
					break;
				}
				y++;
				
			}
			
			x++;
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
			   /*int x = 2;
			    while (x <= 100) {
			      int y = 2;
			      while (y <= x) {
			        if (x == y) {
			          System.out.println(x);
			        }
			        if (x % y == 0) {
			          break;
			        }
			        y++;
			      }
			      x++;
			    }*/
		
		
		 /*  int count = 0, max_count = 100, i;
	      //  System.out.println("First "+max_count+" Prime Numbers:");

	        for(int num=1; count<max_count; num++)
	        {
	            for(i=2; num%i != 0; i++);

	            if(i == num)
	            {
	                System.out.print(" "+num);
	                count++;
	            }
			  }*/
		
		 /*  int count = 0, i;
		      //  System.out.println("First "+max_count+" Prime Numbers:");

		        for(int num=1; count<100; num++)
		        {
		            for(i=2; num%i != 0; i++);

		            if(i == num)
		            {
		                System.out.print(" "+num);
		                count++;
		            }
				  }*/
			

}
	}
