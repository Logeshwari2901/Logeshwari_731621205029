package Assignment1;
import java.util.*;
public class Factorial {
	public static void main(String[]args) {
		Scanner s=new Scanner(System.in);
		int fact=1;
		int num=s.nextInt();
		for(int i=1;i<=num;i++) {
			fact=fact*i;
		}
		System.out.println(fact);
	}
}
