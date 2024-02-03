package p1;
import java.util.*;

public class LeapYear {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the Year : ");
		double a=sc.nextDouble();
		if(a%400==0 )
		{
			System.out.println("Leap Year");
		}
		else if(a%100==0)
		{
			System.out.println("Not Leap Year");
		}
		else if(a%4==0)
		{
			System.out.println("Leap Year");
		}
		else
		{
			System.out.println("Not Leap Year");
		}

	}

}
