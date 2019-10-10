
public class classnew {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		

int[] a = {1,2,1,22,23,34,44,33,34};



for(int i=0;i<a.length-1;i++){

for(int j=i+1;j<a.length;j++)
{

if(a[i] == a[j]){

System.out.println("Duplicate Element is :  " +a[j]);

}

}

}
}
}