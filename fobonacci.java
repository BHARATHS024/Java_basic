package p1;
import java.util.*;

public class fobonacci {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number N : ");
		int a=sc.nextInt();
		int n1=0;
		int n2=1;
		int n3;
		for(int i=1;i<=a;i++)
		{
			System.out.print(n1+" ");
			n3=n1+n2;
			n1=n2;
			n2=n3;
		}

	}

}
