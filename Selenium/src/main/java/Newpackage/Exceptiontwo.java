package Newpackage;

public class Exceptiontwo {

	public static void checkAge(int age)  {
		// TODO Auto-generated method stub
		
		 if (age < 18) {
		      throw new ArithmeticException("Access denied - You must be at least 18 years old."); 
		    }
		    else {
		      System.out.println("Access granted - You are old enough!"); 
		    }
		  } 

		  public static void main(String[] args) { 
		    checkAge(15); // Set age to 15 (which is below 18...)
		  } 

	}


