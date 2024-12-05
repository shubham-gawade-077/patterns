package Nested_Forloop_Series;

import java.util.Scanner;

public class Series1_3 { 
	//sum=1!/x^1+2!/x^2+3!/x^3+.........

	public static void main(String[] args) 
	{
		double sum=0.0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		
		System.out.println("Enter the x");
		int x=sc.nextInt();
		
		for(int i=1;i<=n;i++)
		{
			int f1=1;//fact
			int f2=1;//power
			for(int j=i;j>1;j--)//factorial
			{
				f1=f1*j;
			}
			for(int k=1;k<=i;k++)//power
			{
				f2=f2*x;
			}
			sum=sum+(double)(f1/f2);
		}
		System.out.println("sum= "+sum);
	}

}
