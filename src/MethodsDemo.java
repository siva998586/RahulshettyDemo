
public class MethodsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodsDemo s = new MethodsDemo();
		String k = s.getData();
		System.out.println(k);
		getData2();
		//MethodsDemo.getData2();
		
	}
	
	public String getData() {
		System.out.println("Santosh");
		return "meesala";
	}
	
	public static String getData2() {
		 
		System.out.println("Kumar");
		return "Meesala";
	}

}
