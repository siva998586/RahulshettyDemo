package Basic;

public class Demo{
	
	public static void main (String args[]) {
		
		Student s1 = new Student();
		s1.ShowData();
		
		Student s2 = new Student();
		s2.ShowData();
	}
	
}



class Student {
	int a;
	static int b;
	
	Student (){
		b++;
	}
	
	public void ShowData() {
		System.out.println("Value od a is.." +a);
		System.out.println("Value od B is .."+b);
	}
	
}