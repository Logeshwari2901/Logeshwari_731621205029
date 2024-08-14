package Assignment1;
import java.util.*;

public class Prime {
	   public static void main(String [] args)
	   {
	      Scanner sc=new Scanner(System.in);
	       int n=sc.nextInt();
	       prime(n);
	     }
	     static void prime(int n)
	    {
	     int c=0;
	     for(int i=2;i<n/2;i++)
	     {
	    if(n%1==0){
	     c++;
	     break;
	    }
	    }
	     if(c==0 && n>1)
	     System.out.print("prime");
	     else 
	     System.out.print("Not Prime");
	     }

}
