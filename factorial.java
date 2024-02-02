package p1;
import java.util.*;

public class factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number N : ");
		int a=sc.nextInt();
		int b=1;
		for(int i=1;i<=a;i++)
		{
			b=b*i;
		}
		System.out.println("Factorial of N : "+b);
		

	}

}
