package Newpackage;

public class Arrayvideo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//Accessing : arrayRefVar[index]
		//Updating : arrayRefVar[index] = newValue
		
		//Single Value Containers 
		
		int state1populatincount = 502;
		int state2populatiocount = 765;
		int state3populationcount = 987;
		int state4populationcount = 456;
		int state5populationcount = 876;
		
		//Multi Value Container
		
		/*int[] countrypopulation = new int[5];
		System.out.println("statepopulation is:"+countrypopulation);*/
		
		int[] countrypopulation = new int[] {502,765,987,456,876};
		
		//Read a element in array
		
		//System.out.println("countrypopulation[0]is:" +countrypopulation[0]);
		//System.out.println("countrypopulation[1]is:" +countrypopulation[1]);
		
		//Read All
		
		
		
		for(int i=0;i<countrypopulation.length;i++) {
			System.out.println("countrypoulation["+i+"] is:" +countrypopulation[i]);
			
		}
		
		//Write Update Operation
		
	countrypopulation[0]=1502;
		countrypopulation[1]=7265;
	countrypopulation[2]=3987;
		countrypopulation[3]=4456;
	countrypopulation[4]=8676;
	countrypopulation[4]=8674;

	System.out.println("After Write Operation :");
	
	/*for(int i=0;i<countrypopulation.length;i++) {
		System.out.println("Test");
		System.out.println("countrypopulation["+i+"] is:" +countrypopulation[i]);
	}*/
	
	
//Enhanced For loop
	int count=0;
	for(int elm:countrypopulation) {
		count = count+elm;
		System.out.println(elm);
		
	}
	System.out.println("Total Count is: " +count);
	
	
	
	
	
	}

}
