package While_loop;

import java.util.Scanner;

public class SumOfDigit {

	public static void main(String[] args) 
	{
		int sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		
		while(n>0)
		{
			int n1=n%10;
			    n=n/10;
			    sum=sum+n1;
		}
		System.out.println("sum= "+sum);
	}

}
