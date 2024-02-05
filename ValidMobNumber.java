package practice;
import java.util.*;

public class ValidMobNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter number : ");
		String str=sc.next();
		
		if(str.length()==10)
		{
			if(str.charAt(0)=='7' || str.charAt(0)=='8' || str.charAt(0)=='9')
			{
				System.out.println("Valid Mobile number.");
			}
			else
			{
				System.out.println("Invalid Mobile number.");
			}
		}
		else
		{
			System.out.println("Invalid Mobile number.");
		}
		

	}

}
