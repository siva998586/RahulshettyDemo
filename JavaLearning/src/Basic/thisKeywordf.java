package Basic;

public class thisKeywordf {
	
	int a;
	int b;
	
	public void setData(int c , int d) {
		
		this.a=c;
		this.b=d;
	}
	
	public void showData() {
		System.out.println("Value of a is:..-> " +a);
		System.out.println("value of b is...-> " +b);
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		thisKeywordf obj = new thisKeywordf();
		obj.setData(1,2);
		obj.showData();
		
	}

}
