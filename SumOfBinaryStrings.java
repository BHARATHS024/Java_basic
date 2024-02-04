package p1;
import java.util.*;

public class SumOfBinaryStrings {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter 1st binary Strings : ");
		String a=sc.next();
		System.out.print("Enter 1st binary Strings : ");
		String b=sc.next();
		int c=bin(a,b);
		String res=Integer.toBinaryString(c);
		System.out.println("Sum of two Binary Strings : "+res);
	}
	
	static int bin(String a,String b)
	{
		int e=Integer.parseInt(a,2);
		int f=Integer.parseInt(b,2);
		
		int g=e+f;
		return g;
	}

}
