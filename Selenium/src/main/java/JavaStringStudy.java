import static org.testng.Assert.ARRAY_MISMATCH_TEMPLATE;

import java.util.Scanner;

public class JavaStringStudy {


	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Stringchar
		
	/*	String s1 = "arjun";
		System.out.println(s1);
		
		String s2 = new String("arjun");
		System.out.println(s2);
		
		char s3[] = {'a','r','j','u','n'};
		System.out.println(s3);*/
		
		
	/*	//Java String Compare To : 
	    //Rule : s1>s2 returns positive number; s1<s2= returns negative number; s1==s2:Equal;
		
		String s1 = "hello";
		String s2 = "hello";
		String s3 = "meklo";
		String s4 = "hemlo";
		String s5 = "flag";
		String s6 = "";
		String s7 = "me";
		System.out.println(s1.compareTo(s2));
		
		
		//101 - 109 = -8 ; s1-s3 - > First Value Compare and Print
		System.out.println(s1.compareTo(s3));
		
	    System.out.println(s1.compareTo(s5));

		System.out.println(s5.compareTo(s6));
		
		System.out.println(s6.compareTo(s7));*/
		
		
	/*	//Java String Concat
		//Once Concat
	
		String a = "I ";
		String b = "am ";
		String c = "good";
		String f = " boy";
		
		String d = a.concat(b);
		String e = d.concat(c);
		String g = e.concat(f);
		System.out.println(g);
		System.out.println(g.length());
		
		//concat with space
		String a1 = "I ";
		String b1 = "am ";
		String c1 = "good";
		String f1 = " boy";
		String g1 = a1.concat(b1).concat("").concat(c1).concat("").concat(f1);
		System.out.println(g1);*/
		
	/*	//Java String Contains - Search Characters : if contains is true else fail
		
		String name = "what is your name";
		System.out.println(name.contains("is"));
		System.out.println(name.contains("your"));
		System.out.println(name.contains("test"));*/
		
		
	/*	//Exampe of above program
		String str = "To learn a new java now";
		if(str.contains("learn")) {
			System.out.println("True");
		}*/
		
		
		/*//endswith - > Check the end suffix if it is matches its true else its false
		//Exampple1:
		String s1 = "java by javatpoint";  
		System.out.println(s1.endsWith("t"));
		System.out.println(s1.endsWith("point"));*/
		
		/*//Example2:
		
		String s2 = "I am working in w2s solutions pvt ltd";
		
		if(s2.endsWith("pvt ltd")) {
			System.out.println("true");
		}*/
		
	/*	//Java String equals - compares the two given strings based on the content of the string. If any character is not matched, it returns false. If all characters are matched, it returns true.
        String s1 = "javatpoint";
		String s2 = "javatpoint";
		String s3 = "JAVATPOINT";
		System.out.println(s1.equals(s2));
		
		if(s2.equals(s3)) {
			System.out.println("Ok");
		}
		else {
			System.out.println("false");
		}*/
		
	/*	//Java String equalsIgnoreCase() - It is not check the case sensitive.  If it is Same its true else its false
		
		String s1 = "javapoint";
		String s2 = "javapoint";
		String s3 = "JAVAPOINT";
		String s4 = "Test";
		System.out.println(s1.equalsIgnoreCase(s2));
		System.out.println(s2.equalsIgnoreCase(s3));
		System.out.println(s3.equalsIgnoreCase(s4));*/
		
	/*//Java String indexOf() : - > Index of current value :
		
		//pass substring
		String s1 = "i am working in way2smile solutions";
		
		int index1 = s1.indexOf("solutions");
		System.out.println(index1);
		
		int index2 = s1.indexOf("working");
		System.out.println(index2);
		
		//Study with youtube
		int index3 = s1.indexOf("working",4);
		System.out.println(index3);
		
		//pass char value
		
		int index4 = s1.indexOf('w');
		System.out.println(index4);*/
		
	/*	//Java String is Empty : - String is Empty True Otherwise it is False
		
	String s1 = "";
	String s2 = "javapoint";
	System.out.println(s1.isEmpty());
	System.out.println(s2.isEmpty());*/
		
		
		//Java string lastIndexOf() - > Print last index of given character value or substring.
		//Enter the character before count and print
		
		/*String s1 = "this is index of example";
		int index1 = s1.lastIndexOf('e');
		System.out.println(index1);*/
		
		/*//Example2  :  - Doubts :
		
		String str = "This is index of example";  
		int index = str.lastIndexOf('s',5);
		System.out.println(index);*/
		
		//Example3 : - Doubts
		
	/*String str = "I am a good boy of the class";
	int index = str.lastIndexOf('g', 5);
	System.out.println(index);*/
		
		/*//Java String length(): - returns count of total number of characters
		
		String s1 = "javapoint";
		String s2 = "javap";
		System.out.println("Output:" +s1.length());
		System.out.println("Output2:" +s2.length()); 
		
		//Example1 Program
		
		String str = "javapoint";
		if(str.length()>0) {
			System.out.println("Output is true");
		}
		if(str.length()==0) {
			System.out.println("Output is false");
		}*/
		
	/*	//Java String replace() - returns all the old char or char sequence or new char
		//Example1 : Replace Char :
	      
		
		String a = "This is a new calender in the class";
		String rep = a.replace('T','H');
		System.out.println(rep);
		
		//Example2 : Replace String :
		
		String b = "Nagarjun is a super person";
		String repp = b.replace("is","was");
		System.out.println(repp);
		
		//Example : Replace Two Times
		
		String c = "This is a big country";
		String reppp = c.replace("big", "small");
		System.out.println(reppp);
		
		String repeat = reppp.replace("small", "big");
		System.out.println(repeat);*/
		
		/*//Java Replace All String :
		
		//Example1 : Single Value Replace All But Use Double Quotes :
		
		String a = "Arjun is a very good boy";
		String ch = a.replaceAll("o", "t");
		System.out.println(ch);
		
		//Example2: Words Replace All
		
		String b = "good boy is arjun. Also arjun is a good boy";
		String duptwo = b.replaceAll("good", "very good");
		System.out.println(duptwo);
				
		
		//Example3: Replace All Remove White Spaces :
		
		String c = "My name is Khan. My name is Bob. My name is Sonoo.";
		String dupnew = c.replaceAll("\\s","");
		System.out.println(dupnew);*/
		
	/*	int sum=0;
		for(int i=1;i<=10;i++) {
			sum+=i;
			System.out.println(sum);
		}*/
		
	/*	//Output : Garbage Value :
		int myArr[] = new int[7];
		System.out.println(myArr);*/
		
		
		/*Type Mismatch Error:
		for(int index=0;1;index++) {
			System.out.println("Welcome");
			break;
		}*/
		
		/*Type Mismatch Error:
		int odd=1;
		if(odd) {
			System.out.println("odd");
		}*/
		
	/*//Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 1 - Compilation Error
		System.out.println(args[1]+args[2]+args[3]);*/
		
		//Implementation classes of List Interface 
		
		
		
		/*String name = "Software";
		
		int len = name.length();
		
		String rev = "";
		
		for(int i=len-1;i>=0;i--) {
			
			rev = rev + name.charAt(i);
		}
		
		System.out.println(rev);
			
	}*/
		
		String[] a = {"I am a Software Tester"};
		
		String ch = "";
	    
         for(int i=0;i<=a.length-1;i++) {
        	 
        	 System.out.println(a[i]);
        	 
         }
	}
}
