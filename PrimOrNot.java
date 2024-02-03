package p1;

import java.util.Scanner;

public class PrimOrNot {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a number : ");
		int a=sc.nextInt();
		prime(a);

	}
	static void prime(int a)
	{
		int count=0;
		for(int i=2;i<a;i++)
		{
			if(a%i==0 && a!=1)
			{
				count++;
			}
		}
		if(count==0 && a!=1) {
			System.out.println("The number is Prime");
		}
		else
		{
			System.out.println("The number is not Prime");
		}
	}
}
