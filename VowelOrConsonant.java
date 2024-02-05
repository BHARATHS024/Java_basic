package p1;
import java.util.*;


public class VowelOrConsonant {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a Letter : ");
		char c=sc.next().charAt(0);
		c=Character.toLowerCase(c);
		if(c =='a' || c =='e' || c=='i' || c=='o' || c=='u')
		{
			System.out.println("character is Vowel.");
		}
		else
		{
			System.out.println("character is Consonant.");
		}
		

	}

}
