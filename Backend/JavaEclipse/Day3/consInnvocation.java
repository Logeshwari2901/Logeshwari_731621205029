package Day3;
class An{
	An(){
		this(5);
		System.out.println("A");
		}
	An(int a){
//		super();
		System.out.println("A 1");
		}
	}
class Bn extends An{
	Bn(){
		super(5);
		System.out.println("B");
		}
	Bn(int a){
		System.out.println("B 1");
		}
	}
public class consInnvocation {
	public static void main(String[]args) {
		Bn obj=new Bn(5);
		}
	}