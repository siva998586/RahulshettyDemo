
public class CoreJava3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// String is an object // String literal
		
		//String s1 = "Santosh Kumar Meesala";
		
		// new 
		
		String s2 = new String ("Welcome");
		String s3 = new String ("Welcome");
		String s = "Santosh Kumar Meesala";
		String [] splittedString = s.split("Kumar");
		System.out.println(splittedString[0]);
		System.out.println(splittedString[1]);
		System.out.println(splittedString[1].trim());
		
		// print string in reverse 
		
		for (int i=s.length()-1; i>=0; i--)
		{
			System.out.println(s.charAt(i));
		

	}

}}

