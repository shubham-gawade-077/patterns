package Nested_Forloop_Series;

import java.util.Scanner;

public class Series2_17 {
// x^2/2! + x^4/4! – x^6/6! +	+ x^n/n!
	public static void main(String[] args) 
	{
		double sum=0.0;
		int f1=1;//power
		int f2=1;//fact
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		
		System.out.println("Enter the x");
		int x=sc.nextInt();
		
		for(int i=2;i<=n;i+=2)//term
		{
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
