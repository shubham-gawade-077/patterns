package Nested_Forloop_Series;

import java.util.Scanner;

public class Series1_8 {
//1 + x + x^2/2! + x^3/3! + x^4/4! +	x^n/n!
	public static void main(String[] args) 
	{
		double sum=0.0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		
		System.out.println("Enter the x");
		int x=sc.nextInt();
		
		for(int i=1;i<=n;i++)//term
		{
			int f1=1;
			int f2=1;
			for(int j=1;j<=i;j++)//power
			{
				f1=f1*x;
			}
			for(int k=i;k>1;k--)//factorial
			{
				f2=f2*k;
			}
			sum=sum+(double)(f1/f2);
		}
		System.out.println("sum= "+sum);
	}

}
