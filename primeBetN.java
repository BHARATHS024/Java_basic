package p1;
import java.util.*;

public class primeBetN {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter N : ");
		int a=sc.nextInt();
		prime(a);

	}
	static void prime(int a)
	{
		
		for(int i=2;i<a;i++)
		{
			int count=0;
			for(int j=2;j<=i/2;j++)
			{
				if(i%j==0)
				{
					count++;
//					System.out.print(i+" ");
					break;
				}
			}
			if(count==0)
			{
				System.out.print(i+" ");
			}
		}
		
			
	}
}
