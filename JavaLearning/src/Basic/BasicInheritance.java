package Basic;

public class BasicInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Surgeon dt=new Surgeon();
		dt.Doctor_Details();
		dt.Surgeon_Details();
		
		
	}
		
	
}


class Doctor{
	
	public void Doctor_Details() {
		System.out.println("Doctor details....");
	}
}
	
	
class Surgeon extends Doctor{
	
	public void Surgeon_Details() {
		System.out.println("Surgeon Details...");
	}

}