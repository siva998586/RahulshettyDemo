import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CoreJava2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr2 = {1,2,3,4,5,6};
		// check if an array has multiple of 2 
		for (int i=0; i<arr2.length;i++) {
			
			if (arr2[i]%2==0) {
				
				System.out.println(arr2[i]);
				//break;
				}
			else {
				System.out.println(arr2[i] + " is not multiples of 2");
			}
		}
		
		ArrayList<String> a = new ArrayList<String>();
		a.add("Santosh");
		a.add("Kumar");
		a.add("Meesala");
		a.add("Test");
		a.add("Engineer");
		System.out.println(a.get(4));
		for(int i=0;i<a.size();i++) {
			System.out.println(a.get(i));
		}
		System.out.println("*************");
		
		for (String K:a) {
			System.out.println(K);
		}
		// Items present in ArrayList
		System.out.println(a.contains("Santosh"));
		
		String[] name = {"Test", "Engineer","Software"};
		List<String> M = Arrays.asList(name);
		System.out.println(M.contains("Test"));
				
}

}
