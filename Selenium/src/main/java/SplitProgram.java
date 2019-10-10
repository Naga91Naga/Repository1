
public class SplitProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
			String s1="I am a Software Tester";  
			String[] words=s1.split("\\s");//splits the string based on whitespace  
			//using java foreach loop to print elements of string array  
		/*	for(String w:words){  
			System.out.println(w);  
			}  */
			
			int wr = words.length;
			System.out.print(wr);
			for(int i=0;i<wr;i++)
			{
				if(i%2 != 0) {
					
					String reverse = new StringBuffer(words[i]).reverse().toString();
					System.out.print(reverse +" ");
				
				}
				
				else if(i%2 == 0){
					System.out.print(words[i] + " ");
				}
				
				else {
					String reverse = new StringBuffer(words[i]).reverse().toString();
					System.out.print(reverse);
				}
			}
			
		
			}

}
