package Nested_Forloop_Series;

import java.util.Scanner;

public class Series2_19 {
// x^2/(2^2*1!) + x^4/(2^4*2!) – x^6/(2^6*3!)
	public static void main(String[] args) 
	{
		double sum=0.0;
		int f1=1;//power
		int f2=1;//power2
		int f3=1;//fact
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		
		System.out.println("Enter the x");
		int x=sc.nextInt();
		
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=i*2;j++) 
			{
				f1=f1*x;
			}
			for(int k=1;k<=i*2;k++)
			{
				f2=f2*2;
			}
			for(int l=i;l>1;l--)
			{
				f3=f3*l;
			}
			int a=(f2*f3);
			sum=sum+(double)(f1/a);
		}
		System.out.println("sum= "+sum);
	}

}
