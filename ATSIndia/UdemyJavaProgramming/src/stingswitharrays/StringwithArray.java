package stingswitharrays;

public class StringwithArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String a = "Siva Rama Krishna";
		
		String b = new String("Surya");
		String c = new String ("Kumar");
		
		
		//System.out.println(a+b+c);
		
	String[] splittedstring = a.split(" ");
	
		System.out.println(splittedstring[0]);
		System.out.println(splittedstring[1]);
		System.out.println(splittedstring[2]);
		
		// print the char string wise 
		for ( int i=0; i<a.length();i++) {
			System.out.println(a.charAt(i));
		}
		
		// print the char string reverse wise
		
		for (int j=a.length()-1; j>=0;j--) {
			System.out.println(a.charAt(j));
		}
		
	}

}
