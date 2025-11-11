package stingswitharrays;
import java.util.ArrayList;

public class DynamicArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList <String> arra = new ArrayList <String>();
		
		arra.add("Siva");arra.add("rama");arra.add("krishna");arra.add("cintala");arra.add("chandramma");arra.add("siri");
		System.out.println(arra);
		System.out.println(arra.get(2));
		
		for (String a : arra) {
			System.out.println(a);
		}
		
	}

}
