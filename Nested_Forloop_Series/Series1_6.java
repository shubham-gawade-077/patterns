package Nested_Forloop_Series;

import java.util.Scanner;

public class Series1_6 {
	//sum=x^1+x^2+x^3+....x^n;

	public static void main(String[] args) 
	{
		int a=1;
		int sum=0;
		Scanner sc=new Scanner(System.in);

		System.out.println("Enter the number");
		int n=sc.nextInt();
		
		System.out.println("Enter the x");
		int x=sc.nextInt();
		
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=i;j++)
			{
				a=a*x;
			}
			sum=sum+a;
		}
		System.out.println("sum= "+sum);
	}

}
