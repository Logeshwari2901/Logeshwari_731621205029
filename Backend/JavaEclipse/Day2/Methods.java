package Day2;

//methods 


public class Methods {
	void myMethod1() {
		System.out.println("Instance Method");
		}
	static void myMethod2() {
		System.out.println("Static Method");
	}
	
	public static void main(String [] args) {
		Methods obj=new Methods();
		obj.myMethod1();
		
		Methods.myMethod2();
	}
	}

