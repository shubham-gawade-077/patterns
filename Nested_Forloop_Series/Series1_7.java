package Nested_Forloop_Series;

import java.util.Scanner;

public class Series1_7 {
	//sum=1^1+2^2+3^3+....n^n;

	public static void main(String[] args) 
	{
		int sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		
		for(int i=1;i<=n;i++)
		{
			int f1=1;
			for(int j=1;j<=i;j++)
			{
				f1=f1*i;
			}
			sum=sum+f1;
		}
		System.out.println("sum= "+sum);
	}

}
