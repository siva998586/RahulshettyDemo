package Methods;

public class mainCalssmethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		mainCalssmethod gd1 = new mainCalssmethod();
		gd1.getdata1();
		
		
		method2 gd2 = new  method2();
		String gg = gd2.getdata2();
		System.out.println(gg);
		
		getdata3();
		

	}
	
	
	public void getdata1() {
		System.out.println("vaues without return data from getdata1");
	}
	
	// with static data calling
	
	public static void getdata3() {
		System.out.println("getdata 3 using static");
		
		
}
}