
public class CoreJava1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int myNum = 5;
		String website = "Santosh Kumar";
		char a = 's';
		double d = 5.99;
		boolean b = true;
		System.out.println(myNum + "  Stores the number ");
		System.out.println(website);
		
		//Array
		
		int [] arr = new int [5];
		arr[0] = 10;
		arr[1] = 20;
		arr[2] = 30;
		arr[3] = 40;
		arr[4] = 50;
		
		int [] arr2 = {1,2,3,4,5,6};
		System.out.println(arr2[0]);
		
		//for loop
		
		for (int i=0; i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
		
		for (int i=0; i<arr2.length;i++)
		{
			System.out.println(arr2[i]);
		}
		
		String [] name = {"santosh", "Kumar", "Meesala"};
		
		for (int i =0; i<name.length;i++)
		{
		
		System.out.println(name[i]);
		}
		
		for (String m:name)
		{
			System.out.println(m);
		}

}
}
