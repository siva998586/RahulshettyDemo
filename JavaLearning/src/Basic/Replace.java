package Basic;

public class Replace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str1 = "Java string contains If else Example";

		System.out.println("After text replace..:::" + str1.replace("Example", "example"));
		
		System.out.println(str1.replaceAll(str1, str1));

	}

}
