package Basic;

import java.util.Arrays;
import java.util.List;

public class ArrayListDemo {

	public static void main(String[] args) {
	
		// Add array list 
		
		String[]  name= {"Siva", "Rama","Krishna", "Selenium"};
		
		List<String> nameasArray = Arrays.asList(name);
		
		System.out.println(nameasArray.contains("Selenium"));
		
		for (String lst : name)
		{
		
		System.out.println(lst);

	}

	}
}
