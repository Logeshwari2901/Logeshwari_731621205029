package Assignment1;
import java.util.*;
public class palindrome {
	static void  Palindrome(int n) 
	{
		int r,rev=0,dup=n;
	while(n!=0)
	{
	r=n%10;
			rev=rev*10+r;
	n=n/10;
	}
	if(dup==rev)
		System.out.print("Plaindrome");
	else
		System.out.print("Not Palindrome");
}
public static void main(String [] args)
{
	Scanner s=new Scanner(System.in);
	int n=s.nextInt();
	Palindrome(n);
}
}
