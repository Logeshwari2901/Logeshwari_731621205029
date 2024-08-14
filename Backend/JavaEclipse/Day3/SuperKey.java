package Day3;
class A{
	int a=20;
	A(String name){
		System.out.println("Welcome "+name);
		}
	void myMethod() {
		System.out.println("I am a super class method");
		}
	}
class B extends A{
	B(){
		super("Logeshwari");
		}
	void myMethod2() {
		System.out.println("Super class variable : "+super.a);
		super.myMethod();
		}
	}
public class SuperKey {
	public static void main(String[]args) {
		B b=new B();
		b.myMethod2();
		}
	}
