package p1;
import java.util.*;
import java.math.*;

public class ArmStrong {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number : ");
		int a=sc.nextInt();
		double z=arm(a);
		System.out.println("ArmStrong value : "+z);
		if(a==z)
		{
			System.out.println("Number is ArmStrong.");
		}
		else
		{
			System.out.println("Number is not ArmString.");
		}

	}
	static double arm(int a)
	{
		int b=0;
		double z=0;
		int s=String.valueOf(a).length();
		for(int i=1;i<=s;i++)
		{
			b=a%10;
			z=Math.pow(b, s)+z;
			b=0;
			a=a/10;
		}
		return z;
	}

}
