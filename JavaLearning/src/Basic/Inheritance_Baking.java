package Basic;

public class Inheritance_Baking {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		WithDraw wt = new WithDraw();
		wt.Doposit_Details();
		wt.Withdraw_details();
	}

	

}


class Deposit {
	int Balance = 2500;
	int a =25;
	int b=0;
	int Sum = a+b;
	
	void Doposit_Details() {
		
		System.out.println("My Account Balance is" + Balance);
		
		  
	}
	
	
	
}


class WithDraw extends Deposit{
	void Withdraw_details() {
		  System.out.println("Withdraw Details...");
		
	}
}