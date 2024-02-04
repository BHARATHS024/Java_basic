package p1;
import java.util.*;

public class GCD {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter two Integers : ");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int d=Math.min(a,b);
		int j=gcd(a,b,d);
		System.out.println("GCD : "+j);
	}
	static int gcd(int a,int b,int d)
	{
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

}
