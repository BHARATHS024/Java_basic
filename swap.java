package p1;
import java.util.*;

public class swap {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter two numbers to swap : ");
		int a=sc.nextInt();
		int b=sc.nextInt();
		swapp(a,b);
	}
	static void swapp(int a,int b)
	{
		int temp=a;
		a=b;
		b=temp;
		System.out.println("a = "+a);
		System.out.println("b = "+b);
		
	}

}
