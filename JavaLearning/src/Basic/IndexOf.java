package Basic;

public class IndexOf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String l1 = "this is my first programming launage";
		//String l2 = "execution is the priority";
		
		System.out.println("index of charecter of 'o': " + l1.indexOf('o'));
		
		//"Index of character 's' after 3 index: "
		
		System.out.println("Index of character 'm' after 3 index: "+ l1.indexOf('m',3));
		
        System.out.println("Index of substring 'is': " + l1.indexOf("is"));
        
        System.out.println("Index of substring 'is' form index:" + l1.indexOf(" ", 10));
		
	}

}
