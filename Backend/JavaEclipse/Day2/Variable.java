package Day2;
//  Types of Variables

public class Variable {
	int b= 20;//Instance or Object Variable
	static int c=30;//Static or class Variable
	
	
	public static void main(String [] args) {
		int a = 10;//Local Variables
		System.out.println("Local Variable : " + a);
		
		
		Variable obj=new Variable();
		System.out.println(obj.b);
	
		System.out.println(Variable.c);
	}

}
