package Assignment1;
import java.util.*;
public class Amstrong {
	static int count(int n) 
	{
		int c=0;
		while(n!=0)
		{
			c++;
			n=n/10;
			}
		return c;
	}
		static void amstrong(int n) 
		{
			int z=count(n),dup=n,s=0,r;
			while(n!= 0) 
			{
				r=n % 10;
			s=s+(int) Math.pow(r,z);
			n=n/10;
			}
			if(s == dup)
				System.out.print("Amstrong");
			else
				System.out.print("Not a Amstrong");
		}
		public static void main(String [] args) {
			Scanner s=new Scanner(System.in);
			int n=s.nextInt();
			amstrong(n);
		}
		}


