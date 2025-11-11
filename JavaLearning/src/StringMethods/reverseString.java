package StringMethods;

public class reverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "madam";
		String t ="";
		
		for (int i=str.length()-1;i>=0;i--) {
			t= t + str.charAt(i);
		
		}
		
		System.out.println(t);
		
		if (str.equals(t)) {
			System.out.println("given string is palendrom");}
			 else {
				System.out.println("given string is not a  palendrom");}
		}
		
}


