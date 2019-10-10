package Newpackage;

public class TwodimensionalArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//arrayRefVar [row][coloumn]
		
		int[][] worldpopulation = {{10,20,30,40},{50,60,70,80}, {90,100,110,120}, {130,140,150,160,170,180}};
	
		
		System.out.println("world population is : " +worldpopulation+"and length is : " +worldpopulation.length);
	
	
	//Read Single Element
		
		System.out.println("Worldpopulation[1][2] :" +worldpopulation[1][2]);
		
	
		//Write and Update Data
		
		worldpopulation[1][2] = 7777;
		System.out.println("Reading :");
		
		System.out.println("Worldpopulation[1][2]:" +worldpopulation[1][2]);
		
	
		//Read All
		
		
		for(int i=0;i<worldpopulation.length;i++) {
			for(int j=0;j<worldpopulation[i].length;j++) {
				
				System.out.println(worldpopulation[i][j]+"");
			}
			System.out.println();
		}
		
		
		int[][] arr = new int[3][5];
		
		
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.println(arr[i][j] +"");
			}
			
			System.out.println();
		}
		
		

		
		
	}

}
