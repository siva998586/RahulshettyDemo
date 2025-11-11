package Basic;

public class Simple_String {
	
	public static void main (String args[]) {
	
		
		 String str1 = "Rock";
		String str2= "Star";
		String Str= str1+str2;
		
		System.out.println("concatination of two strings: "+ str1.concat(str2));
		
		char[] arrSample = {'R', 'O', 'S', 'E'};
		String strSample_1 = new String (arrSample);
		
		System.out.println("array Sample is " + strSample_1);
		
		System.out.println("concatination of using operator sysmbol: "+ str1+str2);
		System.out.println(Str.length());
		
	}

}
