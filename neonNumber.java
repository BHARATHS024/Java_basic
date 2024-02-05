package p1;
import java.util.*;

public class neonNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a number : ");
		int a=sc.nextInt();
		neon(a);
	}
	static int square(int a)
	{
		return a*a;
	}
	static void neon(int a)
	{
		int n=square(a);
		int z=String.valueOf(n).length();
		int s=0;
		for(int i=1;i<=z;i++)
		{
			int p=n%10;
			s=s+p;
			n=n/10;
		}
		System.out.println("Sum of integers of Square : "+s);
		if(s==a)
		{
			System.out.println("Enter number is Neon number.");
		}
		else
		{
			System.out.println("Enter number is  not Neon number.");
		}
		
	}

}
