package Basic;

import java.util.ArrayList;

public class Test_arrayList {
	
	public static void main(String args[]) {
		
		ArrayList<String> aryList = new ArrayList<String>();
		
		//size of the Array List
		System.out.println("Size of the Array list at the Creation: "+ aryList.size());
		
		//Add Array List
		aryList.add("Siva");
		aryList.add("Rama");
		aryList.add("Krishna");
		
		System.out.println("After adding ArrayLists are: " + aryList.size() + " Those are"+aryList);
		
		// Remove some arry element form ArrayList
		
		System.out.println("After Rmoving some Element: "+ aryList.remove("Siva"));
		
		//After Removing the Element 
		System.out.println("After Removing the elements are: "+ aryList.size()+" "+ aryList);
		
		// Removing element using index
		
		System.out.println("Removing element using index [0] "+ "" + aryList.remove(0));
		
		
		//After Removing the Element using index
		
		System.out.println("After Removing the Element indux[0]" + aryList);
		
		//After adding  the Element 
		
		System.out.println("After adding the Element is: " + aryList.add("Siva"));
		
		
		//After adding  the Element is 
		
		System.out.println("	After adding  the Element "+ aryList);
		
		//Check if List contains "siva"
		System.out.println("Check if List contains'siva'"+ aryList.contains("Siv"));
		
			
		
		
	}
}
 