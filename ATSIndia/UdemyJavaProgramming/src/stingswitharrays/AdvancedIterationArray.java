package stingswitharrays;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AdvancedIterationArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] name = {"Siva", "Rama","Krishna"};
		
		//Advanced array iteration
		
		for (   String s:name)
		{
			System.out.println("Iteration Arry using Advanced: " + s);
		}
		

		// convert String Array list in to dynamic Array list

		List<String> ArrayasList= Arrays.asList(name);
		
		System.out.println(ArrayasList.contains("Siva"));
		
		
	}

}
