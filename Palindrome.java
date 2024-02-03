package p1;
import java.util.*;

public class Palindrome {
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the String : ");
		String str=sc.next();
		String rev="";
		for(int i=0;i<str.length();i++)
		{
			rev=str.charAt(i)+rev;
		}
		System.out.println("Reverse String : "+rev);
		if(str.equals(rev))
		{
			System.out.println("String is Palindrome");
		}
		else
		{
			System.out.println("String is not Palindrome");
		}
	}

}
