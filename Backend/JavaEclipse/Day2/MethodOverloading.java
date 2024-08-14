package Day2;

public class MethodOverloading {
	void m1(String name) {
		System.out.println("Welcome " + name);
	}
	void m1(int a ,int b) {
		System.out.println("Sum : " + (a+b));
	}

	int m1 (float a) {
		System.out.print("one Float");
		return 0;
	}
	public static void main(String [] args) 
	{
		 MethodOverloading mol =new  MethodOverloading();
		 mol.m1("Logeshwari");
		 mol.m1(10 ,20);
		 mol.m1(6.5f);
		 }
}
                                                                                            