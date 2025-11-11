package stingswitharrays;

public class ArrayIteration {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	int [] arr	= new int[5];
	
	arr[0]=1; arr[1]=2; arr[2]=3; arr[3]=4; arr[4]=5;
	
	int[] arr2 = {6, 7, 8 , 9 , 10};
	
	
	for (int i=0; i<arr.length; i++)
	{
		System.out.println(arr[i]);
		
	}
	System.out.println("second Array lit is :");
	for (int j=0; j<arr2.length; j++) {
		
		System.out.println(arr2[j]);
		
	}
	
	String[] name = {"Siva" , "Rma" , "Krishna" };
	
	for (int k=0; k<name.length; k++) {
		System.out.println("string array is: "+name[k]);
	}
	
	}
}


