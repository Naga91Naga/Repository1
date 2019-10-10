package Workoutnewnew;

import java.util.Scanner;

public class Newclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Scanner in = new Scanner(System.in);
		//System.out.println("Enter a String : ");
		//String s=in.next(); 	// if it is a word, else in.nextLine()
		
		
		String s= "changeme";
		String word="";
		for(int i=0;i<s.length();i++)
		{
			char ch=s.charAt(i);	// taking the characters
			if(i%2!=0)			// position alteration
			ch=Character.toUpperCase(ch);
			word=word+ch;	// making the new word
		}
		
		
		System.out.println("Required String : "+word);
		
	}

}
