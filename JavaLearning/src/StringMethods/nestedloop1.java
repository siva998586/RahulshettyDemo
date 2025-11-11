package StringMethods;

public class nestedloop1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	/*	
		for (int i=0;i<=2;i++) {
			System.out.println("Outerloop Started..");
			
			for (int j=0;j<=2;j++)
			{
				System.out.println("Innerloop execution***");
			}
			System.out.println("Outerloop Ended..");
			
		} */
		
	/*	************************************
		1	2	3	4	
		5	6	7	
		8	9	
		10	

		***********************************
		
		int k=1;
		for (int i=0;i<=4;i++) {
			
			for (int j=1;j<=4-i;j++)
			{
				System.out.print(k);
				System.out.print("\t");
				k++;
				
			}
			System.out.println("");
			
		} */
		
	/*	
		************************************
		1	
		2	3	
		4	5	6	
		7	8	9	10	

		*********************************** */
		
		/*		
		int k=1;
		for (int i=1;i<=4;i++) {
			
			for (int j=1;j<=i;j++)
			{
				System.out.print(k);
			
				System.out.print("\t");
				k++;
				
			}
			
			System.out.println("");
		} */
		
		/*
		************************************
		1	
		1	2	
		1	2	3
		1	2	3	4

		*********************************** */
		
		/*
		for (int i=1;i<=4;i++) {
			
			for (int j=1;j<=i;j++)
			{
				System.out.print(j);
			
				System.out.print("\t");
				
			}
			
			System.out.println("");
		}*/
		
		
		int k=3;
		for (int i=1;i<=3;i++) {
			
			for (int j=1;j<=i;j++)
			{
				
				System.out.print(k);
				
				System.out.print("\t");
				k=k+3;
				
			}
			
			System.out.println("");
		} 
		

	} 

}
