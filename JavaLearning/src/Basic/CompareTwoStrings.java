package Basic;

public class CompareTwoStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String StringOne = "Guru99";
		String StringTwo = "Guru99";
		String StringThree = "GURU99";
		
		
		System.out.println("is Guru99 equal to Guru99...->" + StringOne.equals(StringTwo));
		
		System.out.println("is Guru eual to Guru99...-> " + StringOne.equals(StringThree));
		
		System.out.println("is Guru eual to Guru99...-> " + StringTwo.equals(StringThree));
		
	}

}
