
public class Reversenew {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String oldstr = "I am a Software Tester";
		
		
		String newstr = "";
		
		String[] split = oldstr.split("");
		
		int length = split.length;
		
		for(int i=0;i<length;i++) {
			
			if(i%2 == 0) {
			newstr += split[i];
		}
			else {
				String word = split[i];
				
				int length1 = word.length();
				
				String newword = "";
				
				for(int j=length1-1;j>=1;j++) {
					
					newword+=word.charAt(j);
				}
				newstr+=newword;
				
			}
		}		
		
		System.out.println(newstr);
		
	}

}
