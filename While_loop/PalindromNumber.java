package While_loop;

import java.util.Scanner;

public class PalindromNumber {

	public static void main(String[] args) 
	{
		int sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		int a=n;
		while(n>0)
		{
			int n1=n%10;
			    n=n/10;
			    sum=(sum*10)+n1;
		}
		if(sum==a)
		{
		System.out.println("palindrom");
		}
		else
		{
			System.out.println("not palindrom");
		}
	}

}
