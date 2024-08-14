package Day2;

public class ConstructorOverloading {
	ConstructorOverloading (String name){
		System.out.println("Welcome " + name);
	}
	ConstructorOverloading(int a,int b){
		this("Logeshwari");
		System.out.println("Sum : " + (a+b));
	}
	ConstructorOverloading(int n){
		this(10,20);
		System.out.println("Number : " + 5);
	}
	public static void main(String[] args) {
		ConstructorOverloading obj =new ConstructorOverloading(5);
		
	}
	
}
