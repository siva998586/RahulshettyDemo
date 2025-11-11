package Basic;

public class ArryDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 int Array[] = new int[7];
		 for(int i=0; i<7; i++) {
			 Array[i] = i+1;
		 }
		 for (int i=0; i<7; i++) {
			 System.out.println("Array ["+ i + "] = "+ Array[i]);
			 
		 }
		 System.out.println("Length of the array is : " + Array.length);
		 
	}

}




