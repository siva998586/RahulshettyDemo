package stingswitharrays;

public class forifelseloopUsingArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr2 = {2, 4, 5, 6, 7, 8 , 9 , 10};
		
		
		for(int a:arr2)
		{
			if (a%2==0)
			{
			System.out.println("Division by 2 is:" +a);
			//break;
			}
			else {
				System.out.println("it is not division by 2 : " + a);
			}
		}
		
	
		
	}

}
