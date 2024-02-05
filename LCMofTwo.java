package p1;
import java.util.*;

public class LCMofTwo 
{
	static int gcd(int a,int b)
	{
		int d=Math.min(a, b);
		int g=0;
		if(a==0)
		{
			g=b;
		}
		else if(b==0)
		{
			g=a;
		}
		
		else
		{
			for(int i=d;i>=1;i--)
			{
				if(a%i==0 && b%i==0)
				{
					g=i;
					break;
				} 
			}
		}
		return g;
	}
	
	static int lcm(int a,int b)
	{
		int l=(a / gcd(a, b)) * b;
		  return l;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter 1st number : ");
		int a=sc.nextInt();
		System.out.print("Enter 2nd number : ");
		int b=sc.nextInt();
		int l=lcm(a,b);
		System.out.print("LCM of two numbers : "+l);

	}
}
