package FirstProgram;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;


import org.openqa.selenium.chrome.ChromeDriver;

public class FirstTestScript {
	
	

	public static void main(String[] args) throws InterruptedException {
		
		   Scanner in = new Scanner(System.in);
	        System.out.print("Input 1st integer: ");
	        int firstInt = in.nextInt();
	        System.out.print("Input 2nd integer: ");
	        int secondInt = in.nextInt();

	        int c = firstInt + secondInt;
	        System.out.printf("Sum of two integers: %d%n", +c);
	        
	        int e=c;
	        
	        int d = e*c;
	        
	        System.out.printf("Sum of two integers: %d%n", +d);
	        
	        
	}

}
