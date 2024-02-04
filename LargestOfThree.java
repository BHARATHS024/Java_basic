package p1;
import java.util.*;

public class LargestOfThree {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter 1st number : ");
		int a=sc.nextInt();
		System.out.print("Enter 2nd number : ");
		int b=sc.nextInt();
		System.out.print("Enter 3rd number : ");
		int c=sc.nextInt();
		if(a>b && a>c)
		{
			System.out.println("1st number is large.");
		}
		else if(b>a && b>c)
		{
			System.out.println("2nd number is large.");
		}
		else
		{
			System.out.println("3rd number is large.");
		}

	}

}
