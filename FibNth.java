package p1;

import java.util.Scanner;

public class FibNth {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number N : ");
		int a=sc.nextInt();
		int n1=0;
		int n2=1;
		int n3;
		if(a==1)
		{
			System.out.println(0);
		}
		for(int i=0;i<a;i++)
		{
			
			n3=n1+n2;
			n1=n2;
			n2=n3;
			if((a-2)==i)
			{
				System.out.println(n1);
			}
			
		}



	}

}
