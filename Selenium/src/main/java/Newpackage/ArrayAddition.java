package Newpackage;

public class ArrayAddition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int[][] a = { {1, 1, 1},
				{1, 1, 1},
	         	{1, 1, 1}
		};
		
		int[][] b = {
				
				{2, 2, 2},
				{2, 2, 2},
				{2, 2, 2}
		};
		
		System.out.println("Matrix:");
		
		for(int i=0;i<a.length;i++) {
			
			for(int j=0;j<a[i].length;j++) {
				
				System.out.println(a[i][j]+"");
			}
			System.out.println();
		}
		
		System.out.println("Matrix:");
		
	System.out.println("Matrix:");
		
		for(int i=0;i<b.length;i++) {
			
			for(int j=0;j<b[i].length;j++) {
				
				System.out.println(b[i][j]+"");
			}
			System.out.println();
		}
		
		int[][] c = new int[3][3];
		
		
for(int i=0;i<c.length;i++) {
			
			for(int j=0;j<c[i].length;j++) {
				
				c[i][j] = a[i][j] + b[i][j];
			}
			System.out.println();
		}

System.out.println("Matrix:");

for(int i=0;i<c.length;i++) {
	
	for(int j=0;j<c[i].length;j++) {
		
		System.out.println(c[i][j]+"");
	}
	System.out.println();
}

	
	}

}
