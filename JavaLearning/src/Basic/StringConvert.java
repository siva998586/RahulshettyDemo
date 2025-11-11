package Basic;

public class StringConvert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 String strTest = "100";
		 
		 System.out.println("strTest.....-> "+ strTest);
		 
		 int itest = Integer.parseInt(strTest);
		 System.out.println("strTest.....-> "+ itest/4);
		 
		 
		 // integer.valueOf
		 
		 
		 int iVtest = Integer.valueOf(strTest);
		 System.out.println("strTest.....-> "+ iVtest/4);
		 
	}
}

