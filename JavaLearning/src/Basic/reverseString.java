package Basic;

public class reverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//System.out.println(s.charAt(0));
		
		
		//String[] stringcount = s.split("is");
		//System.out.println(stringcount);
	
		/*
		 * System.out.println(stringcount[0]); System.out.println(stringcount[1]);
		 * 
		 * System.out.println(stringcount[1].trim());
		 */

		String s = "this is sivaramakrishna";
		
		//System.out.println(s.length());
		
	/*	
		for(int i=0; i< s.length();i++) {
			
			System.out.println(s.charAt(i));
			
		}*/
		
		
		/*
		 * for (int i = s.length()-1; i>=0; i--) { System.out.println(s.charAt(i)); }
		 */
		
		for (int i= s.length()-1; i>=0 ; i--) {
			System.out.println(s.charAt(i));
			
		}
		
		
		
		
	}

}
